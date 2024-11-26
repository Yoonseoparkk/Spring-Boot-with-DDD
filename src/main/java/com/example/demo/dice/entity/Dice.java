package com.example.demo.dice.entity;

import lombok.Getter;

// Entity 내부에 상태 값을 배치
// 이 상태 값을 획득하고 싶을 경우 사용하는 것이 Getter
// @Getter를 사용하여 getNumber() 매서드(함수)가 자동으로 생성됨
@Getter
public class Dice {

    private int number;
    private int id;

    public Dice(int number, int id) {
        this.number = number;
        this.id = id;
    }

    public int GetDiceNumber() {
        return this.number;
    }
}