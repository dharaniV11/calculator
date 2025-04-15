
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {

            while (true) {
                System.out.print("Enter the first number: ");
                if (scan.hasNextInt()) {
                    a = scan.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scan.next();
                }
            }


            while (true) {
                System.out.print("Enter the second number: ");
                if (scan.hasNextInt()) {
                    b = scan.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scan.next();
                }
            }

            while (true) {
                System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit");
                System.out.print("Enter your choice: ");

                if (!scan.hasNextInt()) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    scan.next();
                    continue;
                }

                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The addition of " + a + " and " + b + " is " + (a + b));
                        break;
                    case 2:
                        System.out.println("The subtraction of " + a + " and " + b + " is " + (a - b));
                        break;
                    case 3:
                        System.out.println("The multiplication of " + a + " and " + b + " is " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("The division of " + a + " and " + b + " is " + (a / b));
                        }
                        break;
                    case 5:
                        if (b == 0) {
                            System.out.println("Error: Modulus by zero is not allowed.");
                        } else {
                            System.out.println("The modulus of " + a + " and " + b + " is " + (a % b));
                        }
                        break;
                    case 6:
                        System.out.println("Exiting the program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            }

        } finally {
            scan.close();
        }
    }
}
