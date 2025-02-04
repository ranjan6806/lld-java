package snakenladder;

import java.util.Random;

public class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int min = 1;
        int max = 6;

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
