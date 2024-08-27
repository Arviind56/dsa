import java.util.Scanner;

public class semicricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        for (int i = 1; i <= N; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            
            // Calculate the distance from (0,0)
            double distanceSquared = x * x + y * y;
            
            // Calculate the year Z
            int Z = (int) Math.ceil(Math.PI * distanceSquared / 100);
            
            // Print the result for the current property
            System.out.println("Property " + i + ": This property will begin eroding in year " + Z + ".");
        }
        
        // Print the end of output
        System.out.println("END OF OUTPUT.");
        
        sc.close();
    }
}
