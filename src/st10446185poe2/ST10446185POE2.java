package st10446185poe2;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
//This class will handle the main logic, such as displaying the menu and calling the appropriate methods for registration, login, and task management.

public class ST10446185POE2 {
    static Scanner loadMe = new Scanner(System.in);
    static int totalHours = 0;
    
    public static void main(String[] args) {
        User user = new User();
        user.registerUser();
        user.loginUser();
        user.displayWelcomeMessage();
        
        boolean running = true;
        TaskManager taskManager = new TaskManager();
        
        while (running) {
            int choice = showMenu();
            switch (choice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.showReport();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + taskManager.getTotalHours());
    }
    
    public static int showMenu() {
        String input = JOptionPane.showInputDialog("Please choose an option:\n1) Add tasks\n2) Show report\n3) Quit");
        return Integer.parseInt(input);
    }
}
