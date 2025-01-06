package shapes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Square extends Shape{
    protected double length;
    @Override
    public double perimeter(){
        return 4*length;
    }

    @Override
    public double surface() {
        return length*length;
    }
}
