package Case_Study.FuramaResort.controllers.Task1;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private void displayMainMenu() {
    }

    public static void main(String[] args) {
        System.out.println("====Menu====");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println();

        int choose;
        System.out.println("Input a number in Menu!: ");
        choose = Integer.parseInt(scanner.nextLine());
        if(choose<1 | choose>6) {
            System.out.println("A number not true!");
        }else {
            switch (choose) {
                case 1:
                    System.out.println("1\tDisplay list employees");
                    System.out.println("2\tAdd new employee");
                    System.out.println("3\tEdit employee");
                    System.out.println("4\tReturn main menu");
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers");
                    System.out.println("2.\tAdd new customer");
                    System.out.println("3.\tEdit customer");
                    System.out.println("4.\tReturn main menu");
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility");
                    System.out.println("2\tAdd new facility");
                    System.out.println("3\tDisplay list facility maintenance");
                    System.out.println("4\tReturn main menu");
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking");
                    System.out.println("2.\tDisplay list booking");
                    System.out.println("3.\tCreate new constracts");
                    System.out.println("4.\tDisplay list contracts");
                    System.out.println("5.\tEdit contracts");
                    System.out.println("6.\tReturn main menu");
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service");
                    System.out.println("2.\tDisplay list customers get voucher");
                    System.out.println("3.\tReturn main menu");
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
