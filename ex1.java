package function_exercises;
import java.util.Scanner;

//Take the input of three numbers and return their avarage.

public class ex1 {

    public static int avarage(int a, int b, int c){
        int av = (a+b+c)/3;
    return av;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        System.out.print("Number3: ");
        int num3 = sc.nextInt();

        System.out.println("Avarage: "+ avarage(num1, num2, num3));
        sc.close();

        
    }
}
