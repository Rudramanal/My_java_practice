import java.util.Scanner;

public class numbered_half_pyramid {
    public static void main(String[] args) {
        
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        //outer loop.
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
            
        }



        sc.close();
    }
}
