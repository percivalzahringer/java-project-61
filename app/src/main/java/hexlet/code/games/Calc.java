package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ROUNDS_COUNT = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static final int MAX_OPERATION = 3;
    public static void playCalc() {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        char[] operation = new char[] {'+', '-', '*'};

        for (int i = 0; i < rounds.length; i++) {
            var firstNumber = Generator.getRandomInt(MIN, MAX);
            var secondNumber = Generator.getRandomInt(MIN, MAX);
            char operator = operation[Generator.getRandomInt(MIN, MAX_OPERATION)];
//            var operation = generateOperation();
            rounds[i][QUESTION] = generateOperation(firstNumber, operator, secondNumber);
            rounds[i][ANSWER] = calculate(firstNumber, secondNumber, operator);
        }
        Engine.engine(TASK, rounds);
    }

    private static String generateOperation(int firstNumber, char operator, int secondNumber) {
        String result;

        switch (operator) {
            case '+':
                result = firstNumber + " + " + secondNumber;
                break;
            case '-':
                result = firstNumber + " - " + secondNumber;
                break;
            case '*':
                result = firstNumber + " * " + secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        };
        return result;
    }
    private static String calculate(int firstNumber, int secondNumber, char operator) {
        String result;

        switch (operator) {
            case '+':
                result = Integer.valueOf(firstNumber + secondNumber).toString();
                break;
            case '-':
                result = Integer.valueOf(firstNumber - secondNumber).toString();
                break;
            case '*':
                result = Integer.valueOf(firstNumber * secondNumber).toString();
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }
        return  result;
    }
}
