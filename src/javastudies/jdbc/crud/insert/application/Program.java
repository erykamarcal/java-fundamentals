package javastudies.jdbc.crud.insert.application;

import javastudies.jdbc.crud.insert.db2.DB2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB2.getConnection();

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?,?,?,?,?)");

            preparedStatement.setString(1, "Ana Maria Braga");
            preparedStatement.setString(2, "anamaria@gmail.com");
            LocalDate date = LocalDate.parse("11/07/2000", formatter);
            preparedStatement.setDate(3, java.sql.Date.valueOf(date));
            preparedStatement.setDouble(4, 5000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB2.closeStatement(preparedStatement);
            DB2.closeConnection();
        }
    }
}
