package hackathonProject;

import java.util.Scanner;

public class AdmissionEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades=null;
        int choice;
        boolean exit = false;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter Grades");
            System.out.println("2. Check Eligibility");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of grades: ");
                    int numGrades = scanner.nextInt();
                    grades = new int[numGrades];
                    for (int i = 0; i < numGrades; i++) {
                        System.out.print("Enter grade " + (i + 1) + ": ");
                        grades[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    if (grades == null || grades.length == 0) {
                        System.out.println("Please enter grades first.");
                    } else {
                        double average = calculateAverage(grades);
                        if (average > 80) {
                            System.out.println("Student is ELIGIBLE for admission.");
                        } else {
                            System.out.println("Student is NOT ELIGIBLE for admission.");
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (!exit);

        scanner.close();
    }

    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

