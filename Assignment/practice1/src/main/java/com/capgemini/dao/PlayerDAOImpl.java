//package com.capgemini.dao;
//
//
//import com.capgemini.Entity.Player;
//import com.capgemini.repository.PlayerRepository;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.List;
//
//public class PlayerDAOImpl implements  PlayerDAO{
//    public void insertPlayer(Player player){
//        String sql="insert into players values(?,?,?)";
////
//        try (Connection conn= PlayerRepository.getConnection();
//             PreparedStatement pstmt= conn.prepareStatement(sql)){
//            pstmt.setInt(1,player.getplayerid());
//            pstmt.setString(2,player.getPlayerName());
//            pstmt.setString(3,player.getPlayerCountry());
//
//            pstmt.executeUpdate();
//            System.out.println("Player Inserted");
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void updatePlayer(Player player) {
//
//    }
//
//    @Override
//    public void deletePlayer(int PlayerId) {
//
//    }
//
//    @Override
//    public List<Player> getAllPlayers() {
//        return null;
//    }
//}
