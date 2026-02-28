package prepared_statement;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3310/college",
                "root",
                "7818906417"
        );
        System.out.println("Connection successful");


//        insert statement
//        String insertQuery = "insert into emp values(?,?,?,?,NOW(),?,?,?)";
//        PreparedStatement insertstm = connection.prepareStatement(insertQuery);
//
//        insertstm.setInt(1, 59);
//        insertstm.setString(2, "Aditi");
//        insertstm.setString(3, "Speaker");
//        insertstm.setInt(4, 7888);
//        insertstm.setInt(5, 5000);
//        insertstm.setInt(6, 0);
//        insertstm.setInt(7, 20);
//
//
//        int rowsinserted = insertstm.executeUpdate();
//        if (rowsinserted > 0) {
//            System.out.println(rowsinserted + " rows inserted");
//
//        } else {
//            System.out.println("Failed");
////        }


//        //update
//        String updatequery="Update emp set job =? where empno=?";
//        PreparedStatement updatestmt=connection.prepareStatement(updatequery);
//        updatestmt.setString(1,"Teacher");
//        updatestmt.setInt(2,59);
//        int rowupdated=updatestmt.executeUpdate();
//        if(rowupdated>0){
//            System.out.println(rowupdated+"rows updated");
//
//        }
//        else {
//            System.out.println("Updated Failed");
//        }

        // delete
        String deletequery="Delete from emp where empno =?";
        PreparedStatement deletest=connection.prepareStatement(deletequery);

        deletest.setInt(1,59);
        int rowdelete=deletest.executeUpdate();
        if(rowdelete>0){
            System.out.println(rowdelete+"row delete");
        }
        else {
            System.out.println("Delete failed");
        }

        //


        }
    }

