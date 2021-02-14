package Activity10;

import java.util.Scanner;

class Square extends Shape {

    Scanner input = new Scanner(System.in);

    public void getName() {
        System.out.println("\nThe Shape is Square");
    }

    public void getArea() {
        System.out.print("Enter Size Length: ");
        int side = input.nextInt();
        System.out.println("The Area = " + (side* side));
    }


}