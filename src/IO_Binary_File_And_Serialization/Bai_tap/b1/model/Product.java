package IO_Binary_File_And_Serialization.Bai_tap.b1.model;


import java.io.Serializable;

public class Product implements Serializable {
    private int codeProduct;
    private String nameProduct;
    private String producer;
    private long money;

    public  Product() {
    }

    public Product(int codeProduct, String nameProduct, String producer, long money) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.money = money;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) { this.codeProduct = codeProduct; }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", money=" + money +
                '}';
    }
}

