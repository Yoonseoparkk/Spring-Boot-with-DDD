//package com.example.demo.game.service;
//
//import com.example.demo.dice.entity.Dice;
//import com.example.demo.dice.repository.DiceRepository;
//import com.example.demo.game.entity.Game;
//import com.example.demo.game.repository.GameRepository;
//import com.example.demo.player.entity.Player;
//import com.example.demo.player.repository.PlayerRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class GameServiceImpl implements GameService {
//    final private GameRepository gameRepository;
//    final private PlayerRepository playerRepository;
//    final private DiceRepository diceRepository;
//
//    @Override
//    public Game createSimpleGame() {
//        List<Player> playerList = playerRepository.list();
//        Player player1 = playerList.get((int)(Math.random()*playerList.size()));
//        Player player2 = playerList.get((int)(Math.random()*playerList.size()));
//        String firstNickname = player1.GetPlayerNickname();
//        String secondNickname = player2.GetPlayerNickname();
//        int firstPlayerSum = 0;
//        int secondPlayerSum = 0;
//
//        String winner = "";
//
//        for (int i=0; i<3; i++) {
//            Dice dice1 = diceRepository.rollDice();
////            player1.AddDiceList(dice1);
//            firstPlayerSum += dice1.GetDiceNumber();
//
//            Dice dice2 = diceRepository.rollDice();
////            player2.AddDiceList(dice2);
//            secondPlayerSum += dice2.GetDiceNumber();
//        }
//
//        if (firstPlayerSum > secondPlayerSum) {
//            winner = firstNickname;
//        } else if (firstPlayerSum == secondPlayerSum) {
//            winner = "None";
//        } else {
//            winner = secondNickname;
//        }
//
//        return gameRepository.create(winner);
//    }
//
//    @Override
//    public String recordGameWinner(int gameId) {
//        return gameRepository.record(gameId);
//    }
//}
