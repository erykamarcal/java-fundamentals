package javastudies.jdbc.crud.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    private static Connection connection = null;

    public static Connection getConnection() {

        if (connection == null) {
            String username = System.getenv("DB_USERNAME");
            String password = System.getenv("DB_PASSWORD");

            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/coursejdbc",
                        username,
                        password
                );

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return connection;
    }

    public static void closeConnection() {

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void closeStatement(Statement statement) {

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}