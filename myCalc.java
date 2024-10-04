import java.util.Scanner;

// two numeric calculator.
public class myCalc {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator.");
        System.out.println();
        System.out.println("    Here are options    \n");
        System.out.println("Sum(1)");
        System.out.println("Substract(2)");
        System.out.println("Multiplication(3)");
        System.out.println("Division(4)");
        System.out.println("Exit(5)");
        System.out.println();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter what do you want: ");
            int option = sc.nextInt();
            System.out.println();
            if (option == 1 || option == 2 || option == 3 || option == 4 || option ==5) {
                if (option == 5) {
                    System.out.println("Exting....\n");
                    return;
                }
    
                System.out.print("Enter the first number: ");
                double num1 = sc.nextInt();
                // System.out.println();
                System.out.print("Enter the second number: ");
                double num2 = sc.nextInt();
                // System.out.println();
    
                switch (option) {
                    case 1:
                        double sum = num1 + num2;
                        System.out.println("Sum is: " + sum);
                        System.out.println();
                        break;
    
                    case 2:
                        double substraction = num1 - num2;
                        System.out.println("Substraction is: " + substraction);
                        System.out.println();
                        break;
    
                    case 3:
                        double multiplication = num1 * num2;
                        System.out.println("Multiplication is: " + multiplication);
                        System.out.println();
                        break;
                    
                    case 4:
                        if (num1 == 0 || num2 == 0) {
                            if (num1 == 0) {
                                System.out.println("Divison is: 0");
                                System.out.println();
                            }else{
                                System.out.println("Division value is undefined.");
                                System.out.println();
                            }
                            break;
                        }
                        double divison = num1 / num2;
                        System.out.println("Division is: " + divison);
                        System.out.println();
                        break;
                        
                
                    default:
                    System.out.println("Invalid syntax!");
                    System.out.println();
                        
            }
            
        }else{
            System.out.println("Invalid Syntax!\n");
            
        }
            

        
    }
    }
}
