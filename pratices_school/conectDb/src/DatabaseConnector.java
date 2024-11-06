import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static String URL = "jdbc:mysql://localhost:3306/dblibros";
    private static String user = "root";
    private static String password = "";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}