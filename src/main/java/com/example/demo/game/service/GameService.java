package com.example.demo.game.service;

import com.example.demo.game.entity.Game;

public interface GameService {
    Game createSimpleGame();
    String recordGameWinner(int gameId);
}
