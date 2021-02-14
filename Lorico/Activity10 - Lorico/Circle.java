package Activity10;

import java.util.Scanner;

class Circle extends Shape {
    Scanner input= new Scanner(System.in);

    public void getName() {
        System.out.println("The Shape is Circle");
    }

    public void getArea() {
        System.out.print("Enter Size Radius: ");
        int radius = input.nextInt();
        System.out.println("The Area = " + (radius*radius)* Math.PI);
    }
}
