import java.security.KeyStore;
import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("\n--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 100; i++) {

                        if (i % 3 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 100; i++) {

                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 100; i++) {

                        if (i % 15 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 4:
                    menu = false;
                    System.out.print("Goodbye!");
                    break;
            }
        }
    }
}