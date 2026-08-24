package javastudies.jdbc.testeConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class teste {

    public static void main(String[] args) {

        Connection connection = null;

        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coursejdbc",
                    username,
                    password
            );

            System.out.println("Conectado ao banco!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        closeConnection(connection);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada!");
            } catch (SQLException e) {
                e.printStackTrace() ;
            }
        }
    }
}