package clean_code_va_refactoring.MVC.service;

import clean_code_va_refactoring.MVC.model.Student;
import clean_code_va_refactoring.MVC.repository.IStudentRepository;
import clean_code_va_refactoring.MVC.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService{
    private final IStudentRepository iStudentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter a code number: ");
        int codeNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a name student: ");
        String nameStudent = scanner.nextLine();
        System.out.println("Enter a day of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter a point: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student1 = new Student(codeNumber, nameStudent, dateOfBirth, point);

    }

    @Override
    public void delete() {
        System.out.println("Enter a code number");
        int codeNumber = Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.getAll();
        int count;

    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student: students) {
            if(student == null) {
                break;
            }
            System.out.println(student);
        }
    }
}