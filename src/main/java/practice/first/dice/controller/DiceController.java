package practice.first.dice.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.first.dice.entity.Dice;
import practice.first.dice.service.DiceService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/dice")
public class DiceController {
    final private DiceService diceService;

    @GetMapping("/practice")
    public String dicePractice() {
        log.info("dicePractice() called");

        return "dicePractice() called";
    }

    @GetMapping("/roll-dice")
    public Dice rollDice() {
        log.info("practice rollDice() called");

        Dice acquiredDice = diceService.rollDice();

        return acquiredDice;
    }
}
