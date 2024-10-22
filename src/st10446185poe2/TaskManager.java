package st10446185poe2;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */
import javax.swing.JOptionPane;
//This class will manage the collection of tasks, including adding tasks and showing reports.
public class TaskManager {
    private int totalHours = 0;

    public void addTask() {
        int taskCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks you wish to enter:"));
        for (int i = 1; i <= taskCount; i++) {
            String taskName = JOptionPane.showInputDialog("Enter the task name:");
            String taskDescription = JOptionPane.showInputDialog("Enter the task description (max 50 characters):");

            while (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                taskDescription = JOptionPane.showInputDialog("Enter the task description (max 50 characters):");
            }
            
            String developerFirstName = JOptionPane.showInputDialog("Enter the developer's first name:");
            String developerLastName = JOptionPane.showInputDialog("Enter the developer's last name:");
            String taskStatus = JOptionPane.showInputDialog("Enter Task Status:\n 'To Do', 'Done', 'Doing'");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the task duration in hours:"));
            
            Task task = new Task(taskName, taskDescription, developerFirstName, developerLastName, taskStatus, taskDuration);
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
            
            totalHours += taskDuration;
        }
    }

    public void showReport() {
        JOptionPane.showMessageDialog(null, "Report - Coming Soon");
    }

    public int getTotalHours() {
        return totalHours;
    }
}
