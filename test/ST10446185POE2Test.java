package st10446185poe2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Makosa Reshoketswe Felicia Rabothata ST10446185
 */
public class ST10446185POE2Test {

    @Test
    public void testTaskDescriptionLength() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn", "Harrison", "To Do", 8);
        Task task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike", "Smith", "Doing", 10);

        Assertions.assertTrue(task1.checkTaskDescription());
        Assertions.assertTrue(task2.checkTaskDescription());
    }

    @Test
    public void testTaskDescriptionLengthExceedsLimit() {
        Task task = new Task("Task Name", "This is a long task description that exceeds the 50 character limit", "John", "Doe", "To Do", 8);

        Assertions.assertFalse(task.checkTaskDescription());
    }

    @Test
    public void testTaskID() {
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn", "Harrison", "To Do", 8);

        // Adjusted the taskID pattern based on task's constructor logic
        Assertions.assertEquals("LO:0:SON", task1.createTaskID());
    }

    @Test
    public void testTotalHoursAccumulated() {
        Task task1 = new Task("Task 1", "Task description 1", "Developer 1", "Last Name 1", "To Do", 10);
        Task task2 = new Task("Task 2", "Task description 2", "Developer 2", "Last Name 2", "Doing", 12);
        Task task3 = new Task("Task 3", "Task description 3", "Developer 3", "Last Name 3", "Done", 55);
        Task task4 = new Task("Task 4", "Task description 4", "Developer 4", "Last Name 4", "To Do", 11);
        Task task5 = new Task("Task 5", "Task description 5", "Developer 5", "Last Name 5", "To Do", 1);

        int totalHours = 0;
        totalHours += task1.getTaskDuration();
        totalHours += task2.getTaskDuration();
        totalHours += task3.getTaskDuration();
        totalHours += task4.getTaskDuration();
        totalHours += task5.getTaskDuration();

        Assertions.assertEquals(89, totalHours);
    }
}
