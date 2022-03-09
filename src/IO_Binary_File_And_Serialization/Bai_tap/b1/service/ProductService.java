package IO_Binary_File_And_Serialization.Bai_tap.b1.service;

import IO_Binary_File_And_Serialization.Bai_tap.b1.model.Product;
import IO_Binary_File_And_Serialization.Bai_tap.b1.repository.IProductRepository;
import IO_Binary_File_And_Serialization.Bai_tap.b1.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    private final IProductRepository iProductRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    public void add(Product product) {
        System.out.println("Nhập mã sản phẩm: ");
        int codeProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String Product = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String nameProducer = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int money = Integer.parseInt(scanner.nextLine());
        Product product1 = new Product(codeProduct, Product, nameProducer, money);
    }

    public void display() {
        Product[] products = iProductRepository.getAll();
        for (Product product: products) {
            if(product == null) {
                break;
            }
            System.out.println(product);
        }
    }

    public void search() {
        System.out.println("Nhập mã sản phẩm: ");
        int codeProduct = Integer.parseInt(scanner.nextLine());
        Product[] products = iProductRepository.getAll();
        int count;
    }

    public void delete(int id) {
    }
}
