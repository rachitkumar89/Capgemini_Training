package com.capgemini.repository;


import java.sql.Connection;
import java.sql.DriverManager;

public class PlayerRepository {
    public  static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3310/college",
                    "root",
                    "7818906417"
            );

        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
