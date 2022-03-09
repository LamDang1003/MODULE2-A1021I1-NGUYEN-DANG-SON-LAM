package IO_Binary_File_And_Serialization.Bai_tap.b1.repository;


import IO_Binary_File_And_Serialization.Bai_tap.b1.model.Product;


public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[20];


    @Override
    public Product[] getAll() {
        return products;
    }

}
