import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextInt();

        float fahrenheit = (celsius * 9f / 5f) + 32f;
        System.out.print("The temperature in Fahrenheit is: " + fahrenheit);

        sc.close();
    }
}
