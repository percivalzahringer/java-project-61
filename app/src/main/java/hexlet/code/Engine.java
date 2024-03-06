package hexlet.code;

import hexlet.code.games.Cli;
import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void engine(String task, String[][] rounds) {
        var name = Cli.greetings();
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        System.out.println(task);
        while (round < COUNT_ROUND) {
            System.out.println("Question: " + rounds[round][QUESTION]);
            System.out.print("Your answer: ");
            var playerAnswer = scanner.nextLine();
            if (playerAnswer.equals(rounds[round][ANSWER])) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rounds[round][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
