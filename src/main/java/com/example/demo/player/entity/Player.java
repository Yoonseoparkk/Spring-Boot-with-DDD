package com.example.demo.player.entity;

import com.example.demo.dice.entity.Dice;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Player {
    private int id;
    private String nickname;
    private List<Dice> diceList;

    public Player(int id, String nickname, List<Dice> diceList) {
        this.id = id;
        this.nickname = nickname;
        this.diceList = diceList;
    }

    public String GetPlayerNickname() {
        return this.nickname;
    }

    public void AddDiceList(Dice dice) {
        this.diceList.add(dice);
    }
}