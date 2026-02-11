package Task;

public class Task {
    private int taskId;
    private String taskName;
    private String status;


    public static int totalTasksCreated = 0;

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = "Pending";
        totalTasksCreated++;
    }

    public int getTaskId() { return taskId; }
    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayTask() {
        System.out.println("ID: " + taskId + " | Name: " + taskName + " | Status: " + status);
    }
}