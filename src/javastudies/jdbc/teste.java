package javastudies.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class teste {

    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coursejdbc",
                    "root",
                    "@Skywalker1977"
            );

            System.out.println("Conectado ao banco!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}