import java.util.Scanner;

public class EmployeeSystem {
    static final int MAX = 100;
    Employee[] employees = new Employee[MAX];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    // Add employee
    public void addEmployee() {
        if (count >= MAX) {
            System.out.println("Employee list is full!");
            return;
        }
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, position, salary);
        System.out.println("Employee added.");
    }

    // Search employee by ID
    public void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Traverse all employees
    public void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                // Shift left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add \n2. Search Employee\n3. Display All\n4. Delete Employee\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> system.addEmployee();
                case 2 -> system.searchEmployee();
                case 3 -> system.displayEmployees();
                case 4 -> system.deleteEmployee();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
