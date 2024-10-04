import java.util.Scanner;

//Two numwric calculator.
public class calc {
    public static void main(String[] args) {
        Scanner soumalya = new Scanner(System.in);
        System.out.println("simple calcutator");
        System.out.println("1. Adition");
        System.out.println("2. substraction");
        System.out.println("3. mutiplication");
        System.out.println("4. division");
        System.out.println("5. exit");
        while (true) {
            System.out.println("choose an option:");
            int option = soumalya.nextInt();
            if(option == 5 ) {
                System.out.println("exiting...");
                break;
            }
            System.out.println("enter first number:");
            double num1 = soumalya.nextInt();
            System.out.println("enter second number:");
            double num2 = soumalya.nextInt();
            switch (option) {
                case 1:
                System.out.println(num1 +"+"+num2+"="+(num1+num2));
                    break;
                case 2:
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case 3:
                System.out.println(num1+"*"+num2+"="+(num1*num2));    
                    break;
                case 4:
                if (num2!=0) {
                    System.out.println(num1+"/"+num2+"="+(num1/num2));}
                else{
                    System.out.println("error: division by zero!");
                }
                break;
                default:
                System.out.println("invalid option,please choose again.");
            }
    

            
        }
        soumalya.close();


    }
}
