import java.util.*;
public class equlibrium_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            int pre[] = new int[n-1];

            for(int j=0;j<n-1;j++){
                pre[j] = arr[j] + arr[j+1];
                arr[j+1] = pre[j];
            }
            for(int i=0;i<n-1;i++){
                if(pre[i] == 0){
                    count =i;
                }
            }
            for(int i=0;i<n-1;i++){
                System.out.println(pre[i]);
            }

        if(count == 0){
            System.out.println("No equilibrium point");
        }
        else{
            System.out.println("Equilibrium point is at index " + count);
        }
    }
}
