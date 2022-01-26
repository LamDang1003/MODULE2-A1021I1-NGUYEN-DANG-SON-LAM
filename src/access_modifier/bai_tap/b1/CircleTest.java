package access_modifier.bai_tap.b1;

import access_modifier.bai_tap.b1.Circle;

public class CircleTest {
    public static void main(String[] args) {
        access_modifier.bai_tap.b1.Circle circle = new access_modifier.bai_tap.b1.Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo");
        System.out.println(circle);
    }
}