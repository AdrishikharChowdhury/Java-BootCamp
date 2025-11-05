
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result = 0f;
        boolean isOn = true;
        while (isOn) {
            System.out.print("Enter 1st number: ");
            float num1 = sc.nextFloat();
            System.out.print("Enter 2nd number: ");
            float num2 = sc.nextFloat();
            System.out.println("Enter your operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result is " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result is " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result is " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is " + result);
                    } else {
                        System.out.println("You cannot divide a number by 0");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using this calculator");
                    isOn = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
        sc.close();
    }
}
