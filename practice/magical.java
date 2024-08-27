import java.util.*;
public class magical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num=0;
        int count =0;
        for(int i=1;i<=num1;i++){
            int zero =0;
            num = i;
            while(num!=0){
                if(num % 2 == 0){
                    zero++;
                }
                num = num/2;
            }
            if(zero % 2==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
