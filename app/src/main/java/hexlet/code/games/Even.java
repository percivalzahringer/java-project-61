package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Even {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ROUND_COUNT = 10;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void playEven() {
        String[][] rounds = new String[ROUND_COUNT][2];
        for (var i = 0; i < rounds.length; i++) {
            var number = Generator.getRandomInt(MIN, MAX);
            rounds[i][QUESTION] = Integer.toString(number);
            rounds[i][ANSWER] = isEven(number) ? "yes" : "no";
        }
        Engine.engine(TASK, rounds);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
