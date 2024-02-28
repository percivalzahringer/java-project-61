package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
            System.out.print("Your choice: ");
            String menu = scanner.nextLine();
            if (menu.equals("0")) {
                break;
            }
            if (menu.equals("1")) {
//                System.out.println("Welcome to the Brain Games!");
                Cli.cli();
                break;
            }

            if (menu.equals("2")) {
                System.out.println("Welcome to the Brain Games!");
                games.gameEven();
                break;
            }

            if (menu.equals("3")) {
                System.out.println("Welcome to the Brain Games!");
                games.calc();
                break;
            }
        }
    }
}
