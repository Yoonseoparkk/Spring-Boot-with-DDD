package com.example.demo.game.controller.request_form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateGameRequestForm {
    private final int playerCount;

    public CreateGameRequestForm toCreateGameRequest() {
        return new CreateGameRequest(this.playerCount);
    }
}