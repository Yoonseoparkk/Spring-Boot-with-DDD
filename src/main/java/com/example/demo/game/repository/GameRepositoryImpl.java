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
    public Game create() {
        Game game = new Game(++gameId);

        gameList.add(game);

        return game;
    }
}
