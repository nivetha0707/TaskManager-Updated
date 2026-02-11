package Task;

public interface TaskManagerInterface {
    void addTask(User user, Task task);
    void listAllTasks(User user);
    void updateTask(User user, int taskId, String newName, String newStatus);
    void deleteTask(User user, int taskId); // This will use the swap logic
}