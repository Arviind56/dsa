import java.util.*;
public class magicalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            int zero =0;
            int num =i;
            while(num!=0){
                if(num %2==0){
                    zero++;
                }
                num = num/2;

            }
            if(zero %2==1){
                count++;
        }
            
        }
    System.out.println(count);
    }
}
