package function_exercises;
import java.util.Scanner;

public class ex4 {
    public static double circumference(double a){

        double cirm = 2*3.1419*a;
    
        return cirm;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double rad = sc.nextDouble();
        System.out.println(circumference(rad));
        sc.close();

    }
}
