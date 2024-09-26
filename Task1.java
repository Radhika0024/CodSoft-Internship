import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        boolean tryAgain = true;

        while (tryAgain) {
            int n = rand.nextInt(1, 101);
            int totalAttempt = 5;
            int attempt = 0;
            int guess = -1;

            System.out.println("You have " + totalAttempt + " attempts to guess the number.");

            while (attempt < totalAttempt && guess != n) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempt++;

                if (guess > n) {
                    System.out.println("Your guess is too high");
                } else if (guess < n) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Your guess is correct!");
                    score += 10;
                }
            }

            if (guess != n) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + n);
                score -= 5;
            }

            sc.nextLine();
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.nextLine();

            if (playAgain.equalsIgnoreCase("yes")) {
                tryAgain = true;
            } else {
                tryAgain = false;
                System.out.println("Well done! Your final score is: " + score);
            }
        }

        sc.close();
    }
}
