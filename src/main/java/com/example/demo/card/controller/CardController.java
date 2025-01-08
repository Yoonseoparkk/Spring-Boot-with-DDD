package com.example.demo.card.controller;

import com.example.demo.card.controller.request_form.CreateCardRequestForm;
import com.example.demo.card.controller.response_form.CreateCardResponseForm;
import com.example.demo.card.service.CardService;
import com.example.demo.card.service.response.CreateCardResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {
    final private CardService cardService;

    @PostMapping("/create")
    public CreateCardResponseForm requestCreateCard(@RequestBody CreateCardRequestForm createCardRequestForm) {
        log.info("requestCreateCare() called");
        CreateCardResponse response = cardService.createCard(createCardRequestForm.toCreateCardRequest());
        return CreateCardResponseForm.from(response);
    }
}