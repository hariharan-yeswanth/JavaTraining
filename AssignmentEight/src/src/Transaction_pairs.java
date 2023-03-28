package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The class transaction_pairs.Main is to demonstrate Transaction Pairs in JDBC
 * 
 * @author HARIHARAN S
 * @version 1.0
 */

public class Transaction_pairs {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Making a connection to the database.
        Connection connection = JDBCConnector.makeConnection();
        String updateString = "update COFFEES " + "set SALES = ? where COF_NAME like ?";
        String updateStatement = "update COFFEES " + "set TOTAL = TOTAL + ? where COF_NAME like ?";
        String query = "select COF_NAME, SALES, TOTAL from COFFEES";
        try {
            PreparedStatement updateSales = connection.prepareStatement(updateString);
            PreparedStatement updateTotal = connection.prepareStatement(updateStatement);

            Statement statement = connection.createStatement();

            // Populating the table with the coffees and their sales and prices.
            populateTable(statement);

            int[] salesForWeek = { 175, 150, 60, 155, 90 };

            String[] coffees = { "Colombian", "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };

            // Turning off the auto commit feature of the database.
            connection.setAutoCommit(false);

            for (int i = 0; i < coffees.length; i++) {
                updateSales.setInt(1, salesForWeek[i]);
                updateSales.setString(2, coffees[i]);
                updateSales.executeUpdate();
                updateTotal.setInt(1, salesForWeek[i]);
                updateTotal.setString(2, coffees[i]);
                updateTotal.executeUpdate();
                // It commits the changes made to the database.
                connection.commit();
            }

            // It turns on the auto commit feature of the database.
            connection.setAutoCommit(true);

            updateSales.close();
            updateTotal.close();

            ResultSet rs = statement.executeQuery(query);

            // Iterating through the result set and printing the result.
            while (rs.next()) {
                String c = rs.getString("COF_NAME");
                int s = rs.getInt("SALES");
                int t = rs.getInt("TOTAL");
                System.out.println(c + " " + s + " " + t);
            }

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());

        }
    }

    public static void populateTable(Statement statement) throws SQLException {
        statement.executeUpdate("insert into coffees values('Colombian',101,8)");
        statement.executeUpdate("insert into coffees values('French_Roast',49,9)");
        statement.executeUpdate("insert into coffees values('Espresso',150,10)");
        statement.executeUpdate("insert into coffees values('Colombian_Decaf',101,9)");
        statement.executeUpdate("insert into coffees values('French_Roast_Decaf',49,10)");

    }
}