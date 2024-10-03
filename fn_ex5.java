package function_exercises;
import java.util.Scanner;

public class ex5 {

    public static void vote(int ag){

        if (ag > 18) {
            System.out.println("You are eligible to vote.");
        }if (ag < 18) {
            System.out.println("You are not eligible to vote.");
        }
        

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age: ");
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }
}
