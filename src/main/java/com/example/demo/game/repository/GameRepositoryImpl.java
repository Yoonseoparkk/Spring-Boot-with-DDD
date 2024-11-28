package com.example.demo.game.repository;

import com.example.demo.game.entity.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GameRepositoryImpl implements GameRepository {

    List<Game> gameList = new ArrayList<>();
    int gameId = 0;

    @Override
    public Game create(String winner) {
        Game game = new Game(++gameId, winner);

        gameList.add(game);

        return game;
    }

    @Override
    public String record(int gameId) {
        if (gameId < 1) {
            return "존재하지 않는 game Id 입니다.";
        }
        else if (gameList.size() >= gameId) {
            return ("승자: " + gameList.get(gameId-1).GetGameWinner());
        }
        return "존재하지 않는 game Id 입니다.";
    }
}
