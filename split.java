import java.util.*;
public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int max =0;
        int count =0;
        String []arr = s.split(",");
        int n = arr.length;
    for(int i=0;i<n;i++){
        count = arr[i].length();
        if(count>max){
            max = count;
        }
    }
    System.out.println(max);
    }
}
