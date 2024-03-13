package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCD {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int ROUND_COUNT = 10;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void playGcd() {
        String[][] rounds = new String[ROUND_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var numberOne = Generator.getRandomInt(MIN, MAX);
            var numberTwo = Generator.getRandomInt(MIN, MAX);
            rounds[i][QUESTION] = numberOne + " " + numberTwo;
            int answer = numberOne > numberTwo ? calculateGSD(numberOne, numberTwo) : calculateGSD(numberTwo, numberOne);
            rounds[i][ANSWER] = Integer.valueOf(answer).toString();
        }
        Engine.engine(TASK, rounds);
    }

    private static int calculateGSD(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }
        return calculateGSD(numberTwo, numberOne % numberTwo);
    }
}
