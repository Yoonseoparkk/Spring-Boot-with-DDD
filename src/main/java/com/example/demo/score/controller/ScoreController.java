package com.example.demo.score.controller;

import com.example.demo.score.controller.request_form.CalculateGamePlayerScoreRequestForm;
import com.example.demo.score.service.ScoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/score")
public class ScoreController {
    final private ScoreService scoreService;

    @PostMapping("/calculate")
    public Boolean calculateGamePlayerScore(@RequestBody CalculateGamePlayerScoreRequestForm calculateGamePlayerScoreRequestForm) {
        log.info("calculateGamePlayerScore() called");

        return scoreService.calculateScore(calculateGamePlayerScoreRequestForm.toCalculateGamePlayerScoreRequest());
    }
}