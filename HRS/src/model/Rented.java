package src.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Rented {

    static Connection connection = null;

    public static void addrented(String h_id, String email) throws SQLException {

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql = "INSERT INTO rented (house_id, user_email) VALUES(?,?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, h_id);
        statement.setString(2, email);
        statement.executeUpdate();

    }
    public static void removerenteduser(String email) throws SQLException {

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql = "DELETE FROM rented WHERE user_email=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        statement.executeUpdate();

    }
    public static void removerentedhouse(String h_id) throws SQLException {

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql = "DELETE FROM rented WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, h_id);
        statement.executeUpdate();

    }

}
