package com.example.demo.game.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RecordGameWinnerRequest {
    private final int gameId;
}
