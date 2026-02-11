package Task;
import java.util.ArrayList;

public class User {
    private int userId;
    private String userName;
    private ArrayList<Task> tasks;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.tasks = new ArrayList<>();
    }

    public int getUserId() { return userId; }
    public String getUserName() { return userName; }
    public ArrayList<Task> getTasks() { return tasks; }
}