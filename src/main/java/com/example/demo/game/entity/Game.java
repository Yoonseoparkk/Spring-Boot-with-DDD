package com.example.demo.game.entity;

import lombok.Getter;

@Getter
public class Game {

    private int gameId;
    private String winner;

    public Game(int gameId, String winner) {
        this.gameId = gameId;
        this.winner = winner;
    }

    public String GetGameWinner() {
        return this.winner;
    }
}