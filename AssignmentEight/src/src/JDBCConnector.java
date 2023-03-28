package src;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Hariharan
 * @version 1.0
 */

public class JDBCConnector {
    static Connection connection = null;

    public static Connection makeConnection() {
        try {
            // Loading the driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connecting to the database.
            connection = DriverManager.getConnection("jdbc:mysql://localhost/assignment8", "root", "Hari@2001");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
