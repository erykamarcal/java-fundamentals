# JDBC – Java Database Connectivity

JDBC é uma API do Java utilizada para conectar aplicações Java a bancos de dados relacionais.

Neste projeto utilizamos **MySQL** e **MySQL Connector/J**.

```text
Java → JDBC → Driver JDBC → MySQL
```

## Configuração

```text
Banco: coursejdbc
Host: localhost
Porta: 3306
```

URL:

```text
jdbc:mysql://localhost:3306/coursejdbc
```

As credenciais são armazenadas em variáveis de ambiente:

```java
String username = System.getenv("DB_USERNAME");
String password = System.getenv("DB_PASSWORD");
```

## Principais componentes

| Componente          | Função                           |
| ------------------- | -------------------------------- |
| `DriverManager`     | Obtém a conexão                  |
| `Connection`        | Representa a conexão             |
| `Statement`         | Executa SQL                      |
| `PreparedStatement` | Executa SQL parametrizado        |
| `ResultSet`         | Armazena resultados de consultas |
| `SQLException`      | Trata erros do JDBC              |

## Classe DB

A classe `DB` centraliza a conexão e o fechamento dos recursos:

```java
DB.getConnection();

DB.closeResultSet(resultSet);
DB.closeStatement(statement);
DB.closeConnection();
```

Ordem de fechamento:

```text
ResultSet → Statement → Connection
```

## SELECT

Consultas utilizam `executeQuery()`:

```java
resultSet = statement.executeQuery(
    "SELECT * FROM department"
);

while (resultSet.next()) {
    System.out.println(
        resultSet.getInt("Id") + ", " +
        resultSet.getString("Name")
    );
}
```

## INSERT

Operações que modificam dados utilizam `executeUpdate()`:

```java
int rowsAffected = preparedStatement.executeUpdate();
```

| Método            | Utilização                   | Retorno     |
| ----------------- | ---------------------------- | ----------- |
| `executeQuery()`  | `SELECT`                     | `ResultSet` |
| `executeUpdate()` | `INSERT`, `UPDATE`, `DELETE` | `int`       |

## PreparedStatement

Permite utilizar parâmetros `?` no SQL:

```java
preparedStatement = connection.prepareStatement(
    "INSERT INTO seller "
    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
    + "VALUES (?, ?, ?, ?, ?)"
);
```

Os valores são definidos através de `setXXX()`:

```java
preparedStatement.setString(1, "Ana Maria Braga");
preparedStatement.setString(2, "anamaria@gmail.com");
preparedStatement.setDate(3, java.sql.Date.valueOf(date));
preparedStatement.setDouble(4, 5000.0);
preparedStatement.setInt(5, 4);
```


## Transactions

Permite executar várias operações como uma única unidade de trabalho.

O AutoCommit é desativado para controlar manualmente a transação:

```connection.setAutoCommit(false);```

Se todas as operações forem executadas corretamente:

```connection.commit();```

Em caso de erro:

```connection.rollback();```

## Fluxo:

```
Início da transação
↓
Operação 1
↓
Operação 2
↓
┌────┴────┐
Sucesso    Erro
↓          ↓
commit    rollback 
```

## Generated Keys

Para recuperar um ID gerado automaticamente:

```java
Statement.RETURN_GENERATED_KEYS
```

Depois:

```java
resultSet = preparedStatement.getGeneratedKeys();
```

## Fluxo básico

```text
Connection
    ↓
Statement / PreparedStatement
    ↓
SQL
    ↓
Execução
    ↓
ResultSet ou rowsAffected
    ↓
Processamento
    ↓
Fechamento dos recursos

```

## Próximos estudos

* [x] UPDATE
* [x] DELETE
* [x] CRUD completo
* [ ] DAO
