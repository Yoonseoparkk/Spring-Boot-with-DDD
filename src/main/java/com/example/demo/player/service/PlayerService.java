package com.example.demo.player.service;

import com.example.demo.player.entity.Player;

import java.util.List;

public interface PlayerService {
    Player createPlayer(String nickname);
    List<Player> playerList();
}