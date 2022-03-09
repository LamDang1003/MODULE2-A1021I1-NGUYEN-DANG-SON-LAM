package IO_Binary_File_And_Serialization.Bai_tap.b1.controller;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ tự tương ứng với yêu cầu của bạn: ");
        System.out.println("1. Thêm sản phẩm. ");
        System.out.println("2. Hiển thị thông tin sản phẩm. ");
        System.out.println("3. Tìm kiếm sản phẩm. ");

        int choice = Integer.parseInt(scanner.nextLine());
    }
}