
import java.util.*;
public class secondlargestarray {
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int count =0;
        int max = Collections.max(set);
        set.remove(max);
        int secondmax = Collections.max(set);
            for(int i=0;i<n;i++){
                if(arr[i] == secondmax){
                    count++;
                }
            }
            System.out.println(count);
        }
}
