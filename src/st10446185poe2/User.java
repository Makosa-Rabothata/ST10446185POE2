package st10446185poe2;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */
import java.util.Scanner;
import javax.swing.JOptionPane; // Import statement for JOptionPane
//  User: This class will handle all user-related functionality such as registration, login, and checking username/password.
public class User {
    static Scanner loadMe = new Scanner(System.in);
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public void registerUser() {
        System.out.println("Please enter your username:");
        username = loadMe.nextLine();
        checkUserName(username);

        System.out.println("Please enter your password:");
        password = loadMe.nextLine();
        checkPasswordComplexity(password);

        System.out.println("Please enter your first name:");
        firstName = loadMe.nextLine();

        System.out.println("Please enter your last name:");
        lastName = loadMe.nextLine();
        System.out.println("\nUser successfully registered!!!");
    }

    public boolean loginUser() {
        System.out.println("Please enter your username:");
        String enteredUsername = loadMe.nextLine();

        System.out.println("Please enter your password:");
        String enteredPassword = loadMe.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
            return true;
        } else {
            System.out.println("Username or password incorrect, please try again.");
            return false;
        }
    }

    public void displayWelcomeMessage() {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
    }

    private boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username Successfully Captured!!!");
            return true;
        } else {
            System.out.println("Username is not correctly formatted.");
            return false;
        }
    }

    private boolean checkPasswordComplexity(String password) {
        if (password.length() >= 8 && password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*")) {
            System.out.println("Password Successfully Captured!!!");
            return true;
        } else {
            System.out.println("Password is not correctly formatted.");
            return false;
        }
    }
}
