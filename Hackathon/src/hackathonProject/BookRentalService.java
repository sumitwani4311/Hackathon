package hackathonProject;

import java.util.Scanner;

public class BookRentalService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = 0;

        while (true) {
            System.out.println("Welcome to the Book Rental Service!");
            System.out.println("1. Enter Number of Days");
            System.out.println("2. Calculate Rental Fee");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of days you wish to rent a book: ");
                    numberOfDays = scanner.nextInt();
                    break;
                case 2:
                    if (numberOfDays == 0) {
                        System.out.println("Please enter the number of days first.");
                        break;
                    }
                    double rentalFee;
                    if (numberOfDays <= 7) {
                        rentalFee = numberOfDays * 10;
                    } else {
                        rentalFee = numberOfDays * 8;
                    }
                    System.out.println("The rental fee for " + numberOfDays + " days is: " + rentalFee + " rupees");
                    break;
                case 3:
                    System.out.println("Thank you for using the Book Rental Service");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

