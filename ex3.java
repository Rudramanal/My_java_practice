package function_exercises;
import java.util.Scanner; 
// @SuppressWarnings("unused")

public class ex3 {
    public static void printGrater(int a, int b){
        if (a > b) {
            System.out.println(a+" is grater than "+b);
        }if (b > a) {
            System.out.println(b+" is grater than "+a);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();

        printGrater(num1, num2);

        
        sc.close();
    }
}
