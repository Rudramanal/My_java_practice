import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        // take the input of the range of the natural numbers.

        Scanner nm = new Scanner(System.in);
        System.out.println("Enter the range of the natural numbers: ");
        int num = nm.nextInt();
        nm.close();

        int sum = 0 ;

        for (int i = 1; i <= num; i++) {
            sum = i+sum;
        }
        System.out.println("Sum is: " + sum);
    }
}
