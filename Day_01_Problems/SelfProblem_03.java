import java.util.Scanner;

public class SelfProblem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int expo = sc.nextInt();

        int power = (int) Math.pow(base, expo);

        System.out.print("The power is: " + power);
        sc.close();
    }
}
