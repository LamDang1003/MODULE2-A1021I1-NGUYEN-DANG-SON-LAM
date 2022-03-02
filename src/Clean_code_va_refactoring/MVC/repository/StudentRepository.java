package Clean_code_va_refactoring.MVC.repository;

import Clean_code_va_refactoring.MVC.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[20];

    static {
        students[0] = new Student(1,"HaiTT","1998-01-01",9);
        students[1] = new Student(2,"TrungDP","1998-01-01",9);
        students[2] = new Student(3,"TrungDC","1998-01-01",9);
    }

    @Override
    public Student[] getAll() {
        return students;
    }
}