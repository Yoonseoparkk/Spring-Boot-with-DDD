package com.example.demo.game.controller.response_form;

import com.example.demo.game.service.response.CheckGameResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CheckGameResponseForm {
    private final String message;


    // CheckGameResponse를 받아서 CheckGameResponseForm을 생성하는 메서드
    public static CheckGameResponseForm from(CheckGameResponse checkGameResponse) {
        return new CheckGameResponseForm(checkGameResponse.getMessage());
    }
}
