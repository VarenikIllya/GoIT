package module4.sub_1;

/**
 * Created by i on 21.12.15.
 */
public class Rectangle extends Figure{
    private int a, b;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    Rectangle(int a){
        this.a = a;
        this.b = a;
    }

    public int calculateArea(){
        return a*b;
    }
}
