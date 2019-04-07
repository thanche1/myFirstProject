package Menu;
import java.security.*;
import java.math.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import Dao.HeadmasterDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserPass {
    private String Username;
    private String password;
    private Connection conn;
    private final String URL = "jdbc:mysql://localhost:3306/schoolproject?serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASS = "Pepitoftw12!";

    private Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public UserPass(String username, String password) {
        Username = username;
        this.password = password;
    }
public UserPass() {

}
    private void closeConnection() {

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
