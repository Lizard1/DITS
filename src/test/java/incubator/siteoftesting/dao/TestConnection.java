package incubator.siteoftesting.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    private String url;
    private String username;
    private String password;
    private boolean flag;

    @Before
    public void setUp(){
        flag = false;
        url = "jdbc:mysql://localhost:3306/statistic_user_role?serverTimezone=Europe/Minsk&useSSL=false";
        username = "root";
        password = "root";
    }

    @Test
    public void getAlbumByIdTest()  {
        System.out.println("Connecting...");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
            flag = true;
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
            flag = false;
        }
        Assert.assertTrue(flag);
    }
}
