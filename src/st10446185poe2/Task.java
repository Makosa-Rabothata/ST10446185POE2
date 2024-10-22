package st10446185poe2;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */

// This class is already defined for handling tasks. I'll keep it as a separate file for task management.
public class Task {
    private static int taskCounter = 0;
    private final String taskName;
    private final String taskDescription;
    private final String developerFirstName;
    private final String developerLastName;
    private final String taskStatus;
    private final int taskDuration;
    private String taskID;

    public Task(String taskName, String taskDescription, String developerFirstName, String developerLastName, String taskStatus, int taskDuration) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.taskStatus = taskStatus;
        this.taskDuration = taskDuration;

        // Generate Task ID
        generateTaskID();
    }

    // Ensures the task description is no more than 50 characters
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // This method returns the Task ID
    public String createTaskID() {
        return taskID;
    }

    // Returns the full task details for display
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
                "Developer Details: " + developerFirstName + " " + developerLastName + "\n" +
                "Task Number: " + taskCounter + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + taskDescription + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Duration: " + taskDuration + " hours";
    }

    // Generates a unique Task ID based on task name and developer's last name
    private void generateTaskID() {
        String initials = taskName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developerLastName.substring(developerLastName.length() - 3).toUpperCase();
        taskID = initials + ":" + taskCounter + ":" + lastThreeLetters;
        taskCounter++;
    }

    // Getter for task duration
    public int getTaskDuration() {
        return taskDuration;
    }
}
