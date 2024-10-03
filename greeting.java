import java.util.Scanner;


public class greeting {

    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        System.out.println("Clik the button: ");
        int button = num.nextInt();

        num.close();

        if (button == 1) {  
            
            System.out.println("Hello");

        }if (button == 2) {
            
            System.out.println("Nomoskar");
            
        }if (button == 3) {
            
            System.out.println("Hii.");
        }

    }
}
