package test.b1;

public class Candidate {
    private String name;
    private int age;
    private String num;
    private int point;

    public Candidate() {
    }
    public Candidate(String name, int age, String num, int point){
        super();
        this.name = name;
        this.age = age;
        this.num = num;
        this.point = point;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
