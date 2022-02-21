package Abstract_class_and_interface.thuc_hanh.b3;

import Abstract_class_and_interface.thuc_hanh.b2.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}