package Task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userMgr = new UserManager();
        TaskManager taskMgr = new TaskManager();

        while (true) {
            System.out.println("\n1. Register | 2. Login | 3. Exit");
            System.out.println("\nEnter your choice:");
            int choice = sc.nextInt();
            if (choice == 3) break;

            if (choice == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                userMgr.addUser(new User(id, name));
            } else if (choice == 2) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                User current = userMgr.findUserById(id);
                System.out.println("\nWelcome, " + current.getUserName() + "!");

                if (current != null) {
                    int opt = -1;
                    while (opt != 5) {
                        System.out.println("\n1. Add Task | 2. List Tasks | 3. Update Task | 4. Delete | 5. Logout\nEnter your Choice:");

                        opt = sc.nextInt();
                        if (opt == 1) {
                            System.out.print("Enter Task ID: "); int tid = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Task Title: "); String tname = sc.nextLine();
                            taskMgr.addTask(current, new Task(tid, tname));
                        } else if (opt == 2) {
                            taskMgr.listAllTasks(current);

                        } else if (opt == 3) {
                            System.out.print("ID to update: "); int uid = sc.nextInt();
                            sc.nextLine();
                            System.out.print("New Name: "); String nn = sc.nextLine();
                            System.out.print("New Status: "); String ns = sc.nextLine();
                            taskMgr.updateTask(current, uid, nn, ns);
                        } else if (opt == 4) {
                            System.out.print("ID to delete: "); int did = sc.nextInt();
                            taskMgr.deleteTask(current, did);
                        }
                    }
                }
            }
        }
        System.out.println("Total tasks handled globally: " + Task.totalTasksCreated);
        sc.close();
    }
}