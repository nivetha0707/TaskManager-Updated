package Task;
import java.util.ArrayList;


public class UserManager implements UserManagerInterface {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User findUserById(int userId) {
        for (User u : users) if (u.getUserId() == userId) return u;
        return null;
    }
}