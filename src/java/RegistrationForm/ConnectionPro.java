
package RegistrationForm;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionPro {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.sqlservel.jdbc.Driver");
            String dbURL = "jdbc:sqlserver://DESKTOP-TMPCHSI\\SQLEXPRESS;databaseName=Assignment_05";
            String userName = "sa";
            String password = "sidra547";

            con = DriverManager.getConnection(dbURL, userName, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
