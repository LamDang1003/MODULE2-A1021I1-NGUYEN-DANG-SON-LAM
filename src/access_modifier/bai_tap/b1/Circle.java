package access_modifier.bai_tap.b1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double v, String indigo){

    }

    public Circle(double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void setColor(String color) {
        this.color = color;
    }
}