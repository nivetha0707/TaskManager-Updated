package Task;
import java.util.ArrayList;
import java.util.Collections;

public class TaskManager implements TaskManagerInterface {

    @Override
    public void addTask(User user, Task task) {
        user.getTasks().add(task);
        System.out.println("Task added successfully.");
    }

    @Override
    public void listAllTasks(User user) {
        if (user.getTasks().isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (Task t : user.getTasks()) t.displayTask();
        }
    }

    @Override
    public void updateTask(User user, int taskId, String newName, String newStatus) {
        for (Task t : user.getTasks()) {
            if (t.getTaskId() == taskId) {
                t.setTaskName(newName);
                t.setStatus(newStatus);
                System.out.println("Task updated.");
                return;
            }
        }
    }

    @Override
    public void deleteTask(User user, int taskId) {
        ArrayList<Task> list = user.getTasks();
        int indexToRemove = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTaskId() == taskId) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            int lastIndex = list.size() - 1;
            Collections.swap(list, indexToRemove, lastIndex);
            list.remove(lastIndex);
            System.out.println("Task deleted using swap-to-delete logic.");
        } else {
            System.out.println("Task not found.");
        }
    }
}