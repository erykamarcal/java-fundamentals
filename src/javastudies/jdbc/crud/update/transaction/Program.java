package javastudies.jdbc.crud.update.transaction;

import javastudies.jdbc.crud.db.DB;
import javastudies.jdbc.crud.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        connection = DB.getConnection();

        try {
            statement = connection.createStatement();

            connection.setAutoCommit(false);

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE departmentId = 1");

            /*  Error simulation during a transaction.
            int x = 1;
            if (x < 2){
                throw new SQLException("Fake Error");
            }  */


            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE departmentId = 2");

            connection.commit();

            System.out.println("Rows 1 = " + rows1);
            System.out.println("Rows 2 = " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! caused by: " + ex.getMessage());
            }

        }
    }
}
