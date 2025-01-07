import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number, a : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number, b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers is: " + sum );
        sc.close();
    }
}
