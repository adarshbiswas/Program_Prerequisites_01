import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        float pi = 3.14f;
        int volume = (int) (pi * Math.pow(radius, 2) * height);
        System.out.print("The volume of cylinder is: " + volume);

        sc.close();
    }
}
