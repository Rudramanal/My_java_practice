package function_exercises;
import java.util.Scanner;

public class ex7 {

    public static double square(double a, double b){
        double sq = a;
        for (double i = 1; i < b; i++) {
            sq *= a;
        }
        return sq;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        System.out.print("Enter the power: ");
        double pow = sc.nextDouble();

        System.out.println(square(num, pow));

        sc.close();

    }
    
}
