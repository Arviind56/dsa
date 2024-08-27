import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                sb.append("even");
            }
            else{
                sb.append("odd");
            }
        }
        System.out.println(sb.toString());
    }
}
