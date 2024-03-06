package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Cli;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String option = scanner.nextLine();

        switch (option) {
            case "0" -> System.out.println("Exit");
            case "1" -> Cli.greetings();
            default -> System.out.println("Invalid value entered");
        }
    }
}
