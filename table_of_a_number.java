import java.util.Scanner;

public class table_of_a_number {
    public static void main(String[] args) {
    
        Scanner  nm = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = nm.nextInt();
        nm.close();

        for(int i=1;i<= 10 ; i++){
            int mult = num * i;
            System.out.println(num+"*"+i+"="+mult);
        }

        
    }
}
