package IO_Binary_File_And_Serialization.Bai_tap.b1;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String producer;
    private long money;

    public Product() {

    }

    public Product(int code, String name, String producer, long money) {
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.money = money;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "code=" + code +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", money=" + money +
                '}';
    }
}

