package com.example.demo.game.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class Game {
    private static int idCounter = 0;
    private final int id;

    private List<Integer> playerIdList;
    private int winnerId;

    public Game(List<Integer> playerIdList) {
        this.id = ++idCounter;
        this.playerIdList = playerIdList;
    }

    public void setWinner(int winnerId) {
        this.winnerId = winnerId;
    }
}