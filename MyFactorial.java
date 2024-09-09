import java.util.Scanner;

public class MyFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for factorial: ");
        int num = input.nextInt();
        int factorial = num;
        int i = num;

        while(i > 1 && i <= num) {
            i = i - 1;
            factorial = factorial * i;
        }

        System.out.println("Factorial for " + num + " :" + factorial);
    }
}
