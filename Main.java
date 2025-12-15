import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== URN PROBABILITY CALCULATOR ===\n");

        System.out.print("Enter number of RED balls in the urn: ");
        int redBalls = scanner.nextInt();

        System.out.print("Enter number of BLUE balls in the urn: ");
        int blueBalls = scanner.nextInt();

        scanner.close();

        System.out.println("the total is " + redBalls + blueBalls);

        int totalBalls = redBalls + blueBalls;

        double Pred = (double) redBalls / totalBalls;

        double Pblue = (double) blueBalls / totalBalls;

        System.out.printf("\nProbability of drawing a RED ball: %.2f%%\n", Pred * 100);
        System.out.printf("\nProbability of drawing a BLUE ball: %.2f%%\n", Pblue * 100);

    }

}