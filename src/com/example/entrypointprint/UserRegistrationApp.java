import java.util.Scanner;

public class UserRegistrationApp {

    // Method to register a new user
    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter date of birth (YYYY-MM-DD):");
        String dateOfBirth = scanner.nextLine();

        // Create a new User object with the entered data
        User user = new User(firstName, lastName, username, dateOfBirth);

        // Logic to store the user data or perform further actions
        // For now, just print a success message
        System.out.println("User registered successfully!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            // Display the main menu options
            System.out.println("Welcome to User Registration App");
            System.out.println("1. Register User");
            System.out.println("2. Get User by Username");
            System.out.println("3. List All Users");
            System.out.println("4. Delete User");
            System.out.println("5. Delete All Users");
            System.out.println("6. Update User Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Read user's choice from input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Process user's choice using a switch statement
            switch (choice) {
                case 1:
                    // Call method to register user
                    // registerUser();
                    break;
                case 2:
                    // Call method to get user by username
                    break;
                case 3:
                    // Call method to list all users
                    break;
                case 4:
                    // Call method to delete user
                    break;
                case 5:
                    // Call method to delete all users
                    break;
                case 6:
                    // Call method to update user details
                    break;
                case 7:
                    isRunning = false; // Exit the application
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }

        scanner.close(); // Close the scanner when done
    }
}
