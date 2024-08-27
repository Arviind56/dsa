import java.util.*;
public class addingprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int n1 = Integer.parseInt(n);
        char arr[] = n.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] -'0';
            // System.out.println(sum);
        }
        // System.out.println(Math.ceil(Math.sqrt(n1)));
        for(int i=2;i<=Math.ceil(Math.sqrt(n1));i++){
            if(n1%i!=0){
                if(sum == i){
                    System.out.println("YES");
                    break;
                }
                // System.out.println(i+" no");
        }
    }
}
}