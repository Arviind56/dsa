import java.util.*;
public class Prime {
    public static boolean isprimme(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=2;i<n;i++){
            if(isprimme(i)){
                sum+=i;
            }
        }
            System.out.println(sum);
    }
}
