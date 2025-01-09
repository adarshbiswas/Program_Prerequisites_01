import java.util.Scanner;

public class SelfProblem_05 {
    public static void main(String[] args) {
        System.out.println("Kilometers to Miles conversion: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371d;

        System.out.print("Miles is: " + miles);

        sc.close();
    }
}
