package com.example.demo.game.controller;

import com.example.demo.game.controller.request_form.CheckGameRequestForm;
import com.example.demo.game.controller.request_form.RecordGameWinnerRequestForm;
import com.example.demo.game.controller.response_form.CheckGameResponseForm;
import com.example.demo.game.controller.response_form.CreateSimpleGameResponseForm;
import com.example.demo.game.controller.response_form.RecordGameWinnerResponseForm;
import com.example.demo.game.entity.Game;
import com.example.demo.game.service.GameService;
import com.example.demo.game.service.request.RecordGameWinnerRequest;
import com.example.demo.game.service.response.CheckGameResponse;
import com.example.demo.game.service.response.CreateSimpleGameResponse;
import com.example.demo.game.service.response.RecordGameWinnerResponse;
import com.example.demo.player.entity.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {
    final private GameService gameService;

    @GetMapping("/create-simple-game")
    public CreateSimpleGameResponseForm createSimpleGame() {
        log.info("createSimpleGame() called!");

        CreateSimpleGameResponse response = gameService.createSimpleGame();

        return CreateSimpleGameResponseForm.from(response);
    }

    @GetMapping("/record-game-winner")
    public RecordGameWinnerResponseForm recordGameWinner(@ModelAttribute RecordGameWinnerRequestForm gameCheckWinnerRequestForm) {
        log.info("recordGameWinner() called");

        RecordGameWinnerResponse response = gameService.recordGameWinner(gameCheckWinnerRequestForm.toRecordGameWinnerRequest());

        return RecordGameWinnerResponseForm.from(response);
    }

    @GetMapping("/check-game")
    public CheckGameResponseForm checkGame(@ModelAttribute CheckGameRequestForm checkGameRequestForm) {
        log.info("checkGame() called");

        CheckGameResponse response = gameService.checkGame(checkGameRequestForm.toCheckGameRequest());

        return CheckGameResponseForm.from(response);
    }

//    @GetMapping("/roll-first-dice")
//    public boolean rollFirstDice() {
//        log.info("rollFirstDice() called");
//
//        return gameService.rollFirstDice();
//    }
}