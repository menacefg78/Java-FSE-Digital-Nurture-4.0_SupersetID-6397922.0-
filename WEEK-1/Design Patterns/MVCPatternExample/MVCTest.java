public class MVCTest {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Alice", "S001", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display original
        controller.updateView();

        // Update via controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Display updated
        controller.updateView();
    }
}
