import java.util.Scanner;
public class Functions {

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    public static int sum (int a, int b){

        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String nm = sc.nextLine();
        // printMyName(nm);
        // sc.close();
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        System.out.println();

        System.out.println("Sum is: "+ sum(num1, num2));

        sc.close();


    }
}
