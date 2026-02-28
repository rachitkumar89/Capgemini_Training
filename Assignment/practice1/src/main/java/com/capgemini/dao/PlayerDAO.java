package com.capgemini.dao;

import java.util.List;
import  com.capgemini.Entity.Player;
public interface PlayerDAO {
    void insertPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(int PlayerId);
    List<Player> getAllPlayers();
}
