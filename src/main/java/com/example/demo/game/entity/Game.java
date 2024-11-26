package com.example.demo.game.entity;

import lombok.Getter;

@Getter
public class Game {

    private int gameId;

    public Game(int gameId) {
        this.gameId = gameId;
    }
}