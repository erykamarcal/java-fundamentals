
````markdown
# JDBC – Conexão com o Banco de Dados

## 1. O que é JDBC?

**JDBC (Java Database Connectivity)** é uma API do Java utilizada para conectar aplicações Java a bancos de dados relacionais.

Com JDBC podemos:

- conectar ao banco;
- executar comandos SQL;
- consultar e manipular dados;
- tratar erros;
- fechar recursos.

O JDBC fornece uma API padronizada, enquanto cada banco possui seu próprio **driver JDBC**.

Neste projeto, utilizamos **MySQL** e o **MySQL Connector/J**.

```text
Java → JDBC → Driver JDBC → MySQL
````

---

## 2. Inicialização

Para utilizar JDBC com MySQL, precisamos de:

1. MySQL em execução;
2. Banco de dados criado;
3. Driver MySQL Connector/J;
4. Credenciais de acesso.

Neste projeto:

```text
Banco: coursejdbc
Host: localhost
Porta: 3306
```

URL de conexão:

```text
jdbc:mysql://localhost:3306/coursejdbc
```

### Dependência Maven

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>VERSAO</version>
</dependency>
```

---

## 3. Credenciais

As credenciais são armazenadas em **variáveis de ambiente**, evitando deixá-las diretamente no código:

```java
String username = System.getenv("DB_USERNAME");
String password = System.getenv("DB_PASSWORD");
```

Variáveis utilizadas:

```text
DB_USERNAME
DB_PASSWORD
```

---

## 4. Principais componentes

| Componente          | Função                                |
| ------------------- | ------------------------------------- |
| `DriverManager`     | Obtém a conexão com o banco           |
| `Connection`        | Representa a conexão com o banco      |
| `Statement`         | Executa instruções SQL                |
| `PreparedStatement` | Executa SQL parametrizado             |
| `ResultSet`         | Armazena resultados de consultas      |
| `SQLException`      | Representa erros relacionados ao JDBC |

---

## 5. Conexão

A conexão é criada através do `DriverManager`:

```java
Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/coursejdbc",
        username,
        password
);
```

Neste projeto, essa lógica foi centralizada na classe `DB`:

```java
connection = DB.getConnection();
```

Assim, o `Program` não precisa conhecer os detalhes da criação da conexão.

---

## 6. Classe `DB`

A classe `DB` centraliza o gerenciamento dos recursos JDBC:

```java
DB.getConnection();

DB.closeResultSet(resultSet);
DB.closeStatement(statement);
DB.closeConnection();
```

Os recursos são fechados no `finally`:

```java
finally {
    DB.closeResultSet(resultSet);
    DB.closeStatement(statement);
    DB.closeConnection();
}
```

Ordem de fechamento:

```text
ResultSet → Statement → Connection
```

---

## 7. `DbException`

`DbException` é uma exceção personalizada para erros relacionados ao banco.

```java
public class DbException extends RuntimeException {
    public DbException(String message) {
        super(message);
    }
}
```

Ela é uma **unchecked exception**, pois herda de `RuntimeException`.

---

# CRUD

## 8. SELECT

Para realizar uma consulta:

```java
connection = DB.getConnection();

statement = connection.createStatement();

resultSet = statement.executeQuery(
        "SELECT * FROM department"
);
```

Fluxo:

```text
Connection
    ↓
Statement
    ↓
executeQuery()
    ↓
ResultSet
```

### Percorrendo o `ResultSet`

O `ResultSet` possui um cursor que percorre os registros através de `next()`:

```java
while (resultSet.next()) {
    System.out.println(
        resultSet.getInt("Id")
        + ", "
        + resultSet.getString("Name")
    );
}
```

`next()`:

* move para o próximo registro;
* retorna `true` enquanto houver registros;
* retorna `false` quando não houver mais registros.

`getXXX()` permite obter os valores das colunas:

```java
resultSet.getInt("Id");
resultSet.getString("Name");
```

---

## 9. `executeQuery()` x `executeUpdate()`

| Método            | Utilização                   | Retorno     |
| ----------------- | ---------------------------- | ----------- |
| `executeQuery()`  | `SELECT`                     | `ResultSet` |
| `executeUpdate()` | `INSERT`, `UPDATE`, `DELETE` | `int`       |

### `executeQuery()`

Utilizado para consultas que retornam dados:

```java
ResultSet resultSet =
        statement.executeQuery("SELECT * FROM department");
```

Retorna um `ResultSet`.

### `executeUpdate()`

Utilizado para operações que modificam dados:

```java
int rowsAffected =
        statement.executeUpdate(...);
```

Retorna um `int`, representando a quantidade de registros afetados.

---

## 10. Fluxo básico do JDBC

```text
Configuração
    ↓
Connection
    ↓
Statement / PreparedStatement
    ↓
SQL
    ↓
Resultado
    ↓
Processamento
    ↓
Fechamento dos recursos
```

---

# Próximos estudos

* [ ] INSERT
* [ ] UPDATE
* [ ] DELETE
* [ ] PreparedStatement
* [ ] CRUD completo
* [ ] DAO

```
```
