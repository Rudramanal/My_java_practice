import java.util.Scanner;

public class conditional_statments {
    
    public static void main(String[] args){
        // if the user's age is under 18 the he is not adult else he is adult.

        // System.out.println("Enter your age: ");

        // Scanner ag = new Scanner(System.in);
        // int age = ag.nextInt(); //taking the input of the user's age. 
        // ag.close();

        // if (age > 18) {
        //     //if he is above 18 then he is an asult.
        //     System.out.println("You are an adult.");

        // }else{
        //     // if he is below 18 then he is not an adult.
        //     System.out.println("You are not an adult.");
        // }

        // //cheking the number is odd or even.

        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int number = num.nextInt(); //taking the user input
        // num.close();

        // if (number%2 == 0) {
        //     //if after deviding this number with two the remainder = 0; then this is an even number.
        //     System.out.println("This number is even.");
            
        // }if (number%2 != 0) {
        //     System.out.println("This number is odd.");
        // }

        //Q: 1st: Take two inputs from user.(a,b)
        //  2nd: if a is bigger, then print a is bigger.
        //  3rd: if a is smaller,than print a is lesser.
        //  4th: if a = b , then print a is equal to b.

        Scanner numm = new Scanner(System.in);

        System.out.println("Enter the fisrt number: ");
        int num1 = numm.nextInt(); //Taking the 1st input.

        System.out.println("Enter the second number: ");
        int num2 = numm.nextInt(); //Taking the second input.

        numm.close();

        if (num1>num2) {

            System.out.println("Number1 is grater than number2.");    

        }if (num2>num1) {

            System.out.println("Number1 is less than number2.");

        }if (num1 == num2) {

            System.out.println("Two numbers are equal.");
            
        }


    }
}
