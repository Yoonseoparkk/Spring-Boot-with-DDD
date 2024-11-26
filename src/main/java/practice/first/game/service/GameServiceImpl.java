package practice.first.game.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.first.dice.entity.Dice;
import practice.first.dice.repository.DiceRepository;
import practice.first.player.entity.Player;
import practice.first.player.repository.PlayerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    final private DiceRepository diceRepository;
    final private PlayerRepository playerRepository;

    @Override
    public String getWinner() {
        if (playerRepository.select().size() == 0)
        {
            return "게임이 이루어지지 않았습니다.";
        }

        int firstDiceSum = 0;
        for (int i = 0; i < 3; i++) {
            Dice firstDice = diceRepository.rollDice();
            firstDiceSum += firstDice.GetDiceNumber();
        }

        int secondDiceSum = 0;
        for (int i = 0; i < 3; i++) {
            Dice secondDice = diceRepository.rollDice();
            secondDiceSum += secondDice.GetDiceNumber();
        }

        List<Player> gamePlayerList = playerRepository.select();
        String firstPlayer = gamePlayerList.getFirst().GetPlayerNickname();
        String secondPlayer = gamePlayerList.getLast().GetPlayerNickname();


        if (firstDiceSum > secondDiceSum) {
            return (firstPlayer+"와 "+secondPlayer+"의 게임입니다.\n"+firstPlayer + "가 승리했습니다!");
        } else if (firstDiceSum == secondDiceSum) {
            return (firstPlayer+"와 "+secondPlayer+"의 게임입니다.\n"+"두 플레이어의 주사위 합이 같아 무승부입니다.");
        }
        else {
            return (firstPlayer+"와 "+secondPlayer+"의 게임입니다.\n"+secondPlayer + "가 승리했습니다!");
        }
    }

}
