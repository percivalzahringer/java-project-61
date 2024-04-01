package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Prime {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN = 2;
    public static final int MAX = 1009;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void playIsPrime() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var number = Generator.getRandomInt(MIN, MAX);
            var isNumberPrime = isPrime(number);
            rounds[i][QUESTION] = Integer.toString(number);
            rounds[i][ANSWER] = isNumberPrime ? "yes" : "no";
        }
        Engine.playGame(TASK, rounds);
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
