package homework4;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Petr", "Ivanov", 34589L);
        Teacher teacher2 = new Teacher("Olga", "Filippova", 773399L);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TeacherGroup teachers = new TeacherGroup("Biology", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Petr", "Ivanov", 34589L);
        teacherController.create("Olga", "Filippova", 773399L);

        teacherController.printConsole(teacherList);
    }
}
