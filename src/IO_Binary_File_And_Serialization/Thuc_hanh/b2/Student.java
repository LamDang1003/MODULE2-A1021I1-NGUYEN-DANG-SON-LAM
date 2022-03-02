package IO_Binary_File_And_Serialization.Thuc_hanh.b2;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    public Student() {

    }

    public Student(int id, String name, String address) {
        this.address = address;
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
