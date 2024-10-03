public class inverted_half_numbered_pyramid {
    public static void main(String[] args) {
        
        int n=5;
        int p=n;
        
        for (int i = 1; i <= n; i++) {

            

            for (int j = 1; j <= p; j++) {
                System.out.print(j+" ");
                
            }
            p--;
            System.out.println();
        }
    }
}
