package hexlet.code;
import java.util.Scanner;

public class games {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        System.out.println("Question: 15");
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        while (true) {
            if (answer.equals("no")) {
                System.out.println("Correct!");

                System.out.println("Question: 6");
                System.out.print("Your answer: ");
                answer = scanner.nextLine();
                if (answer.equals("yes")) {
                    System.out.println("Correct!");

                    System.out.println("Question: 7");
                    System.out.print("Your answer: ");
                    answer = scanner.nextLine();
                    if (answer.equals("no")) {
                        System.out.println("Correct!");
                        System.out.println("Congratulations, " + name + "!");
                        break;
                    } else if (answer.equals("yes")) {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                "Let's try again, " + name + "!");
                        break;
                    }
                } else if (answer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + name + "!");
                    break;
                }
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What is the result of the expression?");
        System.out.println("Question: 12 * 9");
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        while (true) {
            if (answer == 108) {
                System.out.println("Correct!");
                System.out.println("Question: 17 + 10");
                System.out.print("Your answer: ");
                answer = scanner.nextInt();

                if (answer == 27) {
                    System.out.println("Correct!");
                    System.out.println("Question: 9 - 11");
                    System.out.print("Your answer: ");
                    answer = scanner.nextInt();
                    if (answer == -2) {
                        System.out.println("Correct!");
                        System.out.println("Congratulations, " + name + "!");
                        break;
                    } else if (answer != -2) {
                        System.out.println("'" + answer + "' wrong answer ;(. Correct answer was '-2'.\n" +
                                "Let's try again, " + name + "!");
                        break;
                    }

                } else if (answer != 27) {
                    System.out.println("'" + answer + "' wrong answer ;(. Correct answer was '27'.\n" +
                            "Let's try again, " + name + "!");
                    break;
                }

            } else if (answer != 108) {
                System.out.println("'" + answer + "' wrong answer ;(. Correct answer was '108'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
    }

    public static void gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: 25 50");
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        while (true) {
            if (answer == 25) {
                System.out.println("Correct!");
                System.out.println("Question: 100 52");
                System.out.print("Your answer: ");
                answer = scanner.nextInt();

                if (answer == 4) {
                    System.out.println("Correct!");
                    System.out.println("Question: 3 9");
                    System.out.print("Your answer: ");
                    answer = scanner.nextInt();

                    if (answer == 3) {
                        System.out.println("Correct!");
                        System.out.println("Congratulations, " + name + "!");
                        break;

                    } else if (answer != 3) {
                        System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '3'.\n" +
                                "Let's try again, " + name + "!");
                        break;
                    }

                } else if (answer != 4) {
                    System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '4'.\n" +
                            "Let's try again, " + name + "!");
                    break;
                }

            } else if (answer != 25) {
                System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '25'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
    }

    public static void progression() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What number is missing in the progression?");
        System.out.println("Question: 5 7 9 11 13 .. 17 19 21 23");
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        while (true) {
            if (answer == 15) {
                System.out.println("Correct!");
                System.out.println("Question: 2 5 8 .. 14 17 20 23 26 29");
                System.out.print("Your answer: ");
                answer = scanner.nextInt();

                if (answer == 11) {
                    System.out.println("Correct!");
                    System.out.println("Question: 14 19 24 29 34 39 44 49 54 ..");
                    System.out.print("Your answer: ");
                    answer = scanner.nextInt();

                    if (answer == 59) {
                        System.out.println("Correct!");
                        System.out.println("Congratulations, " + name + "!");
                        break;

                    } else if (answer != 59) {
                        System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '59'.\n" +
                                "Let's try again, " + name + "!");
                        break;
                    }

                } else if (answer != 11) {
                    System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '11'.\n" +
                            "Let's try again, " + name + "!");
                    break;
                }

            } else if (answer != 15) {
                System.out.println("'"+ answer + "'" + " is wrong answer ;(. Correct answer was '15'.\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
    }
}
