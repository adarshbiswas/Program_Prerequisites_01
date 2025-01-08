import java.util.Scanner;

public class SelfProblem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Simple Interest rate!");

        System.out.print("Enter principle amount: ");
        float principle = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter time: ");
        float time = sc.nextFloat();

        float SI = (principle * rate * time) / 100;

        System.out.print("The Simple Interest is: " + SI);
        sc.close();

    }
}
