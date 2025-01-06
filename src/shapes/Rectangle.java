package shapes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Rectangle extends Square{
    private double width;
    @Override
    public double perimeter(){
        return 2*(width+length);
    }

    @Override
    public double surface() {
        return length*width;
    }
}
