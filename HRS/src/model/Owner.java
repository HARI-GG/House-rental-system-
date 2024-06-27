package src.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Owner {

    static Connection connection = null;
    public static void loginowner(String name, String email, String pass, String ph) throws SQLException {

        PreparedStatement statement = null;

        connection = DBconnectivity.getConnection();
        String sql = "INSERT INTO owner_details(owner_name, email , password, phone_number) VALUES(?,?,?,?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setString(3, pass);
        statement.setString(4, ph);
        statement.executeUpdate();

    }
    public static void removeowner(String email) throws SQLException{
        
        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="DELETE FROM owner_details WHERE email=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,email);
        statement.executeUpdate();

    }
}
