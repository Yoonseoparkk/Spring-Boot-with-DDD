package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;

import java.util.List;

public interface PlayerRepository {
    Player create(String nickname);
    List<Player> list();
}