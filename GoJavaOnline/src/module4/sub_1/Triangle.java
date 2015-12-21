package module4.sub_1;

/**
 * Created by i on 21.12.15.
 */
public class Triangle extends Figure{
    private int a, b, c, p;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        p = a + b + c;
    }

    public int calculateArea(){
        return (int)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
