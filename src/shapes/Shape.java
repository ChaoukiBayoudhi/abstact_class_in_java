package shapes;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@EqualsAndHashCode//(of = "id")
public abstract class Shape {
    private int id;
    private static int nextId=0;
     public Shape(){
         id=++nextId;
     }
     public abstract double perimeter();
     public abstract double surface();

    @Override
    public boolean equals(Object o) {
        //compare this and o objects based on their surfaces
        return this.surface()==((Shape)o).surface();
    }
}
