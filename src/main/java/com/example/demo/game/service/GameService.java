package com.example.demo.game.service;

import com.example.demo.game.service.request.CheckGameRequest;
import com.example.demo.game.service.request.RecordGameWinnerRequest;
import com.example.demo.game.service.response.CheckGameResponse;
import com.example.demo.game.service.response.CreateSimpleGameResponse;
import com.example.demo.game.service.response.RecordGameWinnerResponse;

public interface GameService {
    CreateSimpleGameResponse createSimpleGame();
    RecordGameWinnerResponse recordGameWinner(RecordGameWinnerRequest gameRecordWinnerRequest);
    CheckGameResponse checkGame(CheckGameRequest checkGameRequest);
}