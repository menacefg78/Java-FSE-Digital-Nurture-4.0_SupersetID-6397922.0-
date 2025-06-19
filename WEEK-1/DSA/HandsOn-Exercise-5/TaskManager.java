import java.util.Scanner;

public class TaskManager {
    Task head = null;
    Scanner sc = new Scanner(System.in);

    // Add Task at end
    public void addTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added.");
    }

    // Search Task by ID
    public void searchTask() {
        System.out.print("Enter Task ID to search: ");
        int id = sc.nextInt();
        Task current = head;

        while (current != null) {
            if (current.taskId == id) {
                System.out.println("Task found: " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    // Traverse all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
        } else {
            Task current = head;
            while (current != null) {
                System.out.println(current);
                current = current.next;
            }
        }
    }

    // Delete Task by ID
    public void deleteTask() {
        System.out.print("Enter Task ID to delete: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != id) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            previous.next = current.next;
            System.out.println("Task deleted.");
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                manager.addTask();
            } else if (choice == 2) {
                manager.searchTask();
            } else if (choice == 3) {
                manager.displayTasks();
            } else if (choice == 4) {
                manager.deleteTask();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

