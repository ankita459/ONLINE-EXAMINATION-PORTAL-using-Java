import java.util.Scanner;

public class OnlineExamPortal {
    private static Scanner scanner = new Scanner(System.in);
    private static String username;
    private static String password;
    private static boolean loggedIn = false;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Online Examination Portal!");
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Take Exam");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    updateProfileAndPassword();
                    break;
                case 3:
                    if (loggedIn) {
                        takeExam();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    System.out.println("Thank you for using the Online Examination Portal!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        loggedIn = true;
        System.out.println("Login successful!");
    }

    private static void updateProfileAndPassword() {
    if (loggedIn) {
        System.out.println("Update your profile and password here.");
        
        // Prompt the user for new profile information
        System.out.print("Enter your new profile information: ");
        String newProfile = scanner.nextLine();
        
        // Prompt the user for new password
        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();
        
        // Update the profile and password variables
        username = newProfile;
        password = newPassword;
        
        System.out.println("Profile and password updated successfully!");
        
        // Add code for MCQs functionality
        System.out.println("MCQs Functionality:");
        // Display the MCQs
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("a) Paris");
        System.out.println("b) London");
        System.out.println("c) Rome");
        System.out.println("d) Berlin");
        
        // Prompt the user for their answer
        System.out.print("Enter your answer: ");
        String answer = scanner.nextLine();
        
        // Check the answer
        if (answer.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    } else {
        System.out.println("Please login first!");
    }
}

    private static void takeExam() {
    System.out.println("Welcome to the exam!");

    // Add code to implement the exam functionality

    // Display the MCQs
    System.out.println("Question 1: What is the capital of France?");
    System.out.println("a) Paris");
    System.out.println("b) London");
    System.out.println("c) Rome");
    System.out.println("d) Berlin");

    // Prompt the user for their answer
    System.out.print("Enter your answer: ");
    String answer = scanner.nextLine();

    // Check the answer
    if (answer.equalsIgnoreCase("a")) {
        System.out.println("Correct!");
    } else {
        System.out.println("Incorrect!");
    }

    // Implement the timer functionality
    int timeLimit = 60; // Time limit in seconds
    long startTime = System.currentTimeMillis();
    long endTime = startTime + (timeLimit * 1000);

    while (System.currentTimeMillis() < endTime) {
        // Continue with the exam
    }

    // Auto submit the exam
    System.out.println("Time's up! Your exam has been automatically submitted.");
}

    private static void logout() {
        loggedIn = false;
        System.out.println("Logout successful!");
    }
}