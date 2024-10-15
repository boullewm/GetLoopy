import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueRolling;
        do {
            int rollNumber = 0;
            int die1, die2, die3;
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");
            do {
                rollNumber++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollNumber, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));
            System.out.print("Do you want to roll again? (Y/N): ");
            continueRolling = scanner.nextLine();
        } while (continueRolling.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
    }
}
