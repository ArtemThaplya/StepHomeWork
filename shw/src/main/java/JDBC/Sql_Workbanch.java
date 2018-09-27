package JDBC;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql_Workbanch {
    void connectionDB() throws SQLException {
        Connection connection = (Connection) DriverManager.
                getConnection("jdbc:mysql://localhost:3306/university", "root","root");
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM teacher");

    }
}
