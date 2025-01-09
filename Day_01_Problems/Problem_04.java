import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        float pi = 3.14f;
        int area = (int) (pi * radius * radius);

        System.out.print("Area of the circle is: " + area);

        sc.close();
    }
}
