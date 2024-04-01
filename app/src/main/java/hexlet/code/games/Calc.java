package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static final int MAX_OPERATION = 3;
    public static void playCalc() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        char[] operation = new char[] {'+', '-', '*'};

        for (int i = 0; i < rounds.length; i++) {
            int firstNumber = generateRandomNumber();
            int secondNumber = generateRandomNumber();
            char operator = generateRandomOperator();
            rounds[i][QUESTION] = generateOperation(firstNumber, operator, secondNumber);
            rounds[i][ANSWER] = Integer.toString(calculate(firstNumber, secondNumber, operator));
        }
        Engine.playGame(TASK, rounds);
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
        }
        return result;
    }
    private static int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }
        return  result;
    }

    private static int generateRandomNumber() {
        return (int) (Math.random() * MAX);
    }

    private static char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }
}
