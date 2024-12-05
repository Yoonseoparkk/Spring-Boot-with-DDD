package com.example.demo.game.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private List<Integer> playerIdList;
    private int winnerId;

    public Game(List<Integer> playerIdList, int winnerId) {
        this.playerIdList = playerIdList;
        this.winnerId = winnerId;
    }

    public Game() {}
}