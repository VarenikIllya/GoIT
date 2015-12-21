package module4.sub_1;

/**
 * Created by i on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3,4,5);
        Figure circle = new Circle(41);
        Figure rectangle = new Rectangle(5);

        System.out.println("Triangle : " + triangle.calculateArea());
        System.out.println("Circle : " + circle.calculateArea());
        System.out.println("Rectangle : " + rectangle.calculateArea());
    }
}
