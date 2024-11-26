package com.example.demo.game.controller;

import com.example.demo.game.entity.Game;
import com.example.demo.game.service.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {
    final private GameService gameService;

    @GetMapping("/create-simple-game")
    public Game createSimpleGame() {
        log.info("createSimpleGame() called");

        return gameService.createSimpleGame();
    }
}
