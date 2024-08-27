import java.util.*;
public class prime_index {
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if (prime(i)) {
                    sum += arr[i];
            }
            // System.out.println("i "+prime(i)+"and sum "+sum);
            // System.out.println(sum);
            }
            System.out.println(sum);
        

    }
}
