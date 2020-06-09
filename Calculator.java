//I worked on the homework assignment alone, using only course materials.
//Daniel Ingo
//5/26/20

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation: ");
        String operationChoice = sc.nextLine().toLowerCase();

        switch (operationChoice) {
        case "add":
            System.out.println("Enter two integers: ");
            if(sc.hasNextInt()) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                add(x, y);
            }
            else{
                System.out.println("Invalid input entered. Terminating...");
            }
            break;

        case "subtract":
            System.out.println("Enter two integers: ");
            int i = sc.nextInt();
            int j = sc.nextInt();
            subtract(i, j);
            break;

        case "multiply":
            System.out.println("Enter two doubles: ");
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            multiply(p, q);
            break;

        case "divide":
            System.out.println("Enter two doubles: ");
            double h = sc.nextDouble();
            double k = sc.nextDouble();
            if (k != 0) {
                divide(h, k);
            } else {
                System.out.println("Invalid input entered. Terminating...");
            }
            break;

        case "alphabetize":
            System.out.println("Enter two words: ");
            String word1 = sc.next();
            String word2 = sc.next();
            alphabetize(word1, word2);
            break;

        default:
            System.out.println("Invalid input entered. Terminating...");
            break;
        }
    }

    public static void add(int x, int y) {
        System.out.println("Answer: " + (x + y));
    }

    public static void subtract(int x, int y) {
        System.out.println("Answer: " + (x - y));
    }

    public static void multiply(double x, double y) {
        double result = x * y;
        System.out.printf("Answer: %.2f\n", result);
    }

    public static void divide(double x, double y) {
        double result = x / y;
        System.out.printf("Answer: %.2f\n", result);
    }

    public static void alphabetize(String word1, String word2) {
        int n = word1.toLowerCase().compareTo(word2.toLowerCase());
        if (n < 0) {
            System.out.println("Answer: " + word1 + " comes before " + word2 + " alphabetically.");
        } else if (n > 0) {
            System.out.println("Answer: " + word2 + " comes before " + word1 + " alphabetically.");
        } else {
            System.out.println("Answer: Chicken or Egg.");
        }

    }
}
