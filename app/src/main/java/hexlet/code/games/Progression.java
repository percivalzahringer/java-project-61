package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Progression {
    public static final String TASK = "What number is missing in the progression?";
    public static final int MIN = 0;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static final int MIN_SIZE_ARRAY = 5;
    public static final int MAX_SIZE_ARRAY = 16;
    public static final int MAX_FIRST_NUMBER = 20;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 11;

    public static void playMissingNumber() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var arraySize = Generator.getRandomInt(MIN_SIZE_ARRAY, MAX_SIZE_ARRAY);
            var step = Generator.getRandomInt(MIN_STEP, MAX_STEP);
            var firstNumber = Generator.getRandomInt(MIN, MAX_FIRST_NUMBER);
            var aps = generateArray(arraySize, step, firstNumber);
            var missedNumber = Generator.getRandomInt(MIN, aps.length);
            rounds[i][ANSWER] = aps[missedNumber];
            aps[missedNumber] = "..";
            rounds[i][QUESTION] = String.join(" ", aps);
        }
        Engine.playGame(TASK, rounds);
    }

    private static String[] generateArray(int arraySize, int step, int firstNumber) {
        String[] numbersToString = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbersToString[i] = Integer.toString(firstNumber + i * step);
        }
        return numbersToString;
    }
}
