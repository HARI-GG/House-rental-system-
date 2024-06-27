package src.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class House {
    static Connection connection = null;
    public static void addhouse(String h_id,String location,String rooms,String floor,String color,String grade,String advrent,String rent,String avl) throws SQLException {

        PreparedStatement statement = null;

        connection = DBconnectivity.getConnection();
        String sql = "INSERT INTO house_details(house_id,location,rooms,floor,color,grade,advance_rent,rent,availability) VALUES(?,?,?,?,?,?,?,?,?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, h_id);
        statement.setString(2, location);
        statement.setString(3, rooms);
        statement.setString(4, floor);
        statement.setString(5, color);
        statement.setString(6, grade);
        statement.setString(7, advrent);
        statement.setString(8, rent);
        statement.setString(9, avl);
        statement.executeUpdate();

    }
    public static void removehouse(String h_id) throws SQLException{
        
        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="DELETE FROM house_details WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,h_id);
        statement.executeUpdate();

    }
    public static void updatecolor(String h_id,String color) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET color=? WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,color);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
    public static void updategrade(String h_id,String grade) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET grade=? WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,grade);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
    public static void updaterooms(String h_id,String rooms) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET rooms=? WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,rooms);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
    public static void updateadvrent(String h_id,String advrent) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET advance_rent=? WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,advrent);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
    public static void updaterent(String h_id,String rent) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET rent=? WHERE house_id=?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,rent);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
    public static void updateavl(String h_id,String avl) throws SQLException{

        PreparedStatement statement = null;
        connection = DBconnectivity.getConnection();
        String sql="UPDATE house_details SET availability =? WHERE house_id =?";
        statement = connection.prepareStatement(sql);
        statement.setString(1,avl);
        statement.setString(2,h_id);
        statement.executeUpdate();
        
    }
}
