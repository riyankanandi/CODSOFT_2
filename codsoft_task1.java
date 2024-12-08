import java.util.*;

public class codsoft_task1 {
    public static int generate() {
        return (int) (Math.random() * 101); // Generate number between 0 and 100
    }

    public static boolean isTrue(int guess, int target) {
        if (guess == target) {
            System.out.println("You are correct!");
            return true;
        }
        if (guess < target) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int attempts = 0;
        int target = generate();

        while (!valid) {
            System.out.println("Enter your guess (between 1 and 100):");
            int guess = sc.nextInt();

            // Validate input
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input. Please try again.");
                continue; // Skip to the next iteration for valid input
            }

            attempts++;
            valid = isTrue(guess, target);
        }

        if (attempts == 1) {
            System.out.println("Congratulations! You guessed the number on your first attempt.");
        } else {
            System.out.println("You guessed the number after " + attempts + " attempts.");
        }
        sc.close();
    }
}
