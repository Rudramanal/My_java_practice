import java.util.Scanner;
public class sum {
    public static void main(String[] args){

        Scanner sm = new Scanner(System.in);

        System.out.println("Enter the First nuber: ");
        int fisrt_num = sm.nextInt();

        System.out.println("Enter the second number: ");
        int second_num = sm.nextInt();

        int sum = fisrt_num + second_num;
        System.out.println("Sum of two numbers is: " + sum );
        
        sm.close();


    }
}
