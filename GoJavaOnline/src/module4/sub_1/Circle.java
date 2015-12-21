package module4.sub_1;

/**
 * Created by i on 21.12.15.
 */
public class Circle extends Figure{
    private int r;

    Circle(int radius){
        this.r = radius;
    }

    public int calculateArea(){
        return (int) (Math.PI*r*r/2);
    }
}
