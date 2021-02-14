package Activity10;
abstract class Shape {
    abstract void getArea();
    abstract void getName();
}

public class abstractShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square shape = new Square();

        circle.getName();
        circle.getArea();

        shape.getName();
        shape.getArea();
    }
} 
