package com.example.demo.game.service;

import com.example.demo.dice.repository.DiceRepository;
import com.example.demo.game.entity.Game;
import com.example.demo.game.repository.GameRepository;
import com.example.demo.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    final private GameRepository gameRepository;

    @Override
    public Game createSimpleGame() {
        return gameRepository.create();
    }
}
