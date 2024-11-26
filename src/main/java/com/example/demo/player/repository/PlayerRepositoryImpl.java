package com.example.demo.player.repository;

import com.example.demo.dice.repository.DiceRepository;
import com.example.demo.player.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository {

    static List<Player> playerList = new ArrayList<>();
    int playerId = 0;

    @Override
    public Player create(String nickname) {
        Player player = new Player(++playerId, nickname, List.of());

        playerList.add(player);

        return player;
    }

    @Override
    public List<Player> list() {
        return playerList;
    }
}