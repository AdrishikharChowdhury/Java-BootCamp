import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is neither prime nor a composite number");
            sc.close();
            return;
        }

        boolean flag = prime(num);

        if (!flag) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
        sc.close();
    }

    public static boolean prime(int num) {
        boolean flag = false;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}