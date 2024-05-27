package ConnectionUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToJDBC {
    private static final String JDBC_URL ="jdbc:mysql://localhost:3306/library_db";
    private static final String JDBC_USERNAME="root";
    private static final String JDBC_PASSWORD="admin";

    public static Connection getConnections() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
    }
}
