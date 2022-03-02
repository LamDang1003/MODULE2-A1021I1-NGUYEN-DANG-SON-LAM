package IO_Binary_File_And_Serialization.Bai_tap.b1;

public class ProductRepository implements iProductRepository{
    private static Product[] products = new Product[20];

    static {
        products[0] = new Product(1, Lam, QuangNgai, 1);
        products[1] = new Product(2, Phuc, QuangNgai, 2);
        products[2] = new Product(3, Anh, QuangNgai, 3);
    }
    @Override
    public Product[] getAll() {
        return products;
    }

}
