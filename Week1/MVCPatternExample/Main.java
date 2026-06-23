public class Main {

    public static void main(String[] args) {

        Student model = new Student();
        model.setName("Karthik");
        model.setId(101);
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        controller.setStudentGrade("A+");

        System.out.println();

        controller.updateView();
    }
}