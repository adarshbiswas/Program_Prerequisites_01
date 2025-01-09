import java.util.Scanner;

public class SelfProblem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to find their average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.print("The average is: " + average);
        sc.close();
    }
}
