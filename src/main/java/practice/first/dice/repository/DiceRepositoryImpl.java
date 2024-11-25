package practice.first.dice.repository;

import org.springframework.stereotype.Repository;
import practice.first.dice.entity.Dice;

@Repository
public class DiceRepositoryImpl implements DiceRepository {
    final int MIN = 1;
    final int MAX = 6;

    private int createdRandomNumber() {
        // 1 ~ 6 사이의 랜덤 값
        int randomNumber = (int) (Math.random() * MAX) + MIN;
        return randomNumber;
    }

    @Override
    public Dice rollDice() {
        int randomNumber = createdRandomNumber();
        Dice dice = new Dice(randomNumber);

        return dice;
    }
}
