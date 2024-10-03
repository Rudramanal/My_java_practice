import java.util.Scanner;


public class factorial {
    
    public static void factoria(int a){
        int fct = 1;
        for (int i = a; i >=1 ; i--) {
            fct = fct*i;

        }
        System.out.print(fct);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        factoria(num);
    }
}
