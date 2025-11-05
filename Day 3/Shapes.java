import java.util.Scanner;

class Rectangle {
    float length;
    float breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the reactagle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of the reactagle: ");
        float breadth = sc.nextFloat();
        Rectangle rect1 = new Rectangle(length, breadth);
        double areaOfRect1 = rect1.calculateArea();
        System.out.println("The area of your rectangle is " + areaOfRect1);
        sc.close();
    }
}