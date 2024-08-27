import java.util.*;
public class rat_eating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int total =  r* unit;
        int count=0;
        int n = sc.nextInt();
        int sum =0;
        int j=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        while(sum>=total){
            arr[j] = sum+arr[j];
            count++;
            j++;
        }
    }
}
 