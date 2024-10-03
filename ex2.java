package function_exercises;
import java.util.Scanner;

// calculate the sum of all odd numbers between 1 to n.

public class ex2 {

    public static int oddSum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i%2 != 0 ) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Range: ");
        int num = sc.nextInt();

        System.out.println("Sum of all odd numbers between 1 to "+num+" is: "+oddSum(num));

        sc.close();

    }
}
