package hexlet.code;

import hexlet.code.games.Cli;
import java.util.Scanner;

public class Engine {
    public static void engine(String task, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);

        for (String[] quest : rounds) {
            System.out.println("Question: " + quest[0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();

            if (quest[1].equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + quest[1] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
