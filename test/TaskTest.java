package st10446185poe2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */
public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testCheckTaskDescription() {
        Task task = new Task("Sample Task", "Short description", "Alice", "Brown", "To Do", 5);
        assertTrue(task.checkTaskDescription());

        Task longTask = new Task("Sample Task", "This is a very long task description that exceeds fifty characters in total", "Alice", "Brown", "To Do", 5);
        assertFalse(longTask.checkTaskDescription());
    }

    @Test
    public void testCreateTaskID() {
        Task task = new Task("Sample Task", "Short description", "Alice", "Brown", "To Do", 5);
        String expectedID = "SA:0:OWN";  // Adjust based on the logic for creating taskID
        assertEquals(expectedID, task.createTaskID());
    }

    @Test
    public void testPrintTaskDetails() {
        Task task = new Task("Sample Task", "Short description", "Alice", "Brown", "To Do", 5);
        String expectedDetails = "Task Status: To Do\n" +
                                 "Developer Details: Alice Brown\n" +
                                 "Task Number: 0\n" +
                                 "Task Name: Sample Task\n" +
                                 "Task Description: Short description\n" +
                                 "Task ID: SA:0:OWN\n" +
                                 "Task Duration: 5 hours";
        assertEquals(expectedDetails, task.printTaskDetails());
    }
}
