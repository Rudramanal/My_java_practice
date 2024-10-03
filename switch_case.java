import java.util.Scanner;

/**
 * switch_case
 */
public class switch_case {

    public static void main(String[] args){

        //Switch case 

        Scanner  bt = new Scanner(System.in);
        int button = bt.nextInt();

        bt.close();

        switch (button) {


            case 1 :
                System.out.println("Hello!");
                break;
            
            case 2 :
                System.out.println("Namaste!");
                break;

            case 3:
                System.out.println("Bonjour!");
                break;

            default:
                System.out.println("Invalid button!");
                break;
                
        }

    }
}