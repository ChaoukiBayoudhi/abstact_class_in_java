package shapes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Disk extends Shape {
    private double radius;
    private Point center;
    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }


    public double surface() {
        return Math.PI*radius*radius;
        //or
        //return Math.PI*Math.pow(radius,2);
    }
}
