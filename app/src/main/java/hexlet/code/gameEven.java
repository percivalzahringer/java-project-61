package hexlet.code;
import java.util.Scanner;

public class gameEven {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        System.out.println("Question: 15");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        while (true) {
            if (answer1.equals("no")) {
                System.out.println("Correct!");

                System.out.println("Question: 6");
                System.out.print("Your answer: ");
                String answer2 = scanner.nextLine();
                if (answer2.equals("yes")) {
                    System.out.println("Correct!");

                    System.out.println("Question: 7");
                    System.out.print("Your answer: ");
                    String answer3 = scanner.nextLine();
                    if (answer3.equals("no")) {
                        System.out.println("Correct!");
                        System.out.println("Congratulations, " + name + "!");
                        break;
                    } else if (answer3.equals("yes")) {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                "Let's try again, " + name + "!");
                        break;
                    }
                } else if (answer2.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + name + "!");
                    break;
                }
            } else if (answer1.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
    }
}
