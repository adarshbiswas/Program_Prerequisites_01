import java.util.Scanner;

public class SelfProblem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Perimeter of a Rectangle!");

        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);
        System.out.print("The perimeter is: " + perimeter);

        sc.close();
    }
}
