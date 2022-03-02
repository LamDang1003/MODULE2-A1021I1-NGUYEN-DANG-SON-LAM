package IO_Binary_File_And_Serialization.Bai_tap.b1;

import Clean_code_va_refactoring.MVC.repository.IStudentRepository;
import Clean_code_va_refactoring.MVC.repository.StudentRepository;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductService implements iProductService{
    private final IStudentRepository iStudentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm: ");
        int codenumber = Integer.parseInt(scanner.nextLine());
        
    }
    @Override
    public void display() {

    }
    @Override
    public void search() {

    }
}
