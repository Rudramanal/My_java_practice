package function_exercises;
import java.util.Scanner;

public class ex6 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        boolean stet = true;
        while (true) {
            System.out.print("Type: ");
            int num = sc.nextInt();

            
            switch (num) {
                case 1:

                    System.out.println(1);
                    break;
                
                case 2:

                    System.out.println(2);
                    break;
                
                case 3:

                    System.out.println("Exiting.....");
                    stet = false;
                    return;
                    
                    
                default:
                    System.out.println("Invalid syntax!");
                    break;
            }
        }

        
    }
}
