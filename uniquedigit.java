import java.util.*;
public class uniquedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lo  = sc.nextInt();
        int hi  = sc.nextInt();
        int count = 0;
        sc.close();
        for(int i=lo;i<=hi;i++)
        {if(isunique(i)){
            count++;
        }}
        System.out.println(count);

    }
    public static boolean isunique(int n){
        boolean arr[] = new boolean[10];
        while(n>0){
            int rem = n%10;
            if(arr[rem] == true){
                return false;
            }
            arr[rem] = true;
            n = n/10;
        }
        return true;
    }
}
