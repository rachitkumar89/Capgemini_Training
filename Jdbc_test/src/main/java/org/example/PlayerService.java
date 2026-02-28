package org.example;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class PlayerService {
    public static void main(String[] args) throws SQLException {
        //Load & Register Driver
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        //Create Connection
        Connection connection=DriverManager.getConnection(
                "jdbc:mysql://localhost:3310/college",
                "root",
                "7818906417"
        );
        System.out.println("Connected Successfully!");

        //create statement
        Statement statement= connection.createStatement();

//        // Insert
//        String query ="Insert  into emp values(7935,'Rachit','Teacher',7902,'1980-12-17',8000,null,20)";
//        int rows= statement.executeUpdate(query);
//        System.out.println(rows+"rows inserted successfully");


        //Fetch data
        ResultSet rs = statement.executeQuery("select * from emp ");
        while (rs.next()){
            int id=rs.getInt("empno");
            String name= rs.getString("ename");
            String job=rs.getString("job");
            System.out.println(id +" "+name+" "+job);
        }

        // Update
        int rowsUpdate= statement.executeUpdate("update emp set job='Teacher' where empno = 7499" );
        if(rowsUpdate >0){
            System.out.println(rowsUpdate+"row updated");
        }
        else {
            System.out.println("Failed");
        }

        //delete
        int rowdelete= statement.executeUpdate("delete from emp where empno=7935");
        if(rowdelete>0){
            System.out.println(rowdelete+"rows delete successfullly");

        }
        else {
            System.out.println("delete failed");
        }
    }
}
