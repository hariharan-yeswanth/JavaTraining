package AssignmentEight;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static ThreadLocal<Connection> clockRoom = new ThreadLocal<>();

    public static Connection getConnection() {
        Connection con = clockRoom.get();
        if (con == null) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "Hari@2001");
                clockRoom.set(con);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return con;
    }

    public static void closeConnection() {
        Connection con = clockRoom.get();
        if (con != null) {
            try {
                con.close();
                clockRoom.remove();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}