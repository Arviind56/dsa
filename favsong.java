import java.util.*;
public class favsong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        int max =0;
        int k = sc.nextInt();
        int n = str.length();
        for(int i=0;i<=n-k;i++){
            String str1 = str.substring(i,i+k);
            char arr[] = str1.toCharArray();
            // System.out.println(str1);
            for(int j=0;j<arr.length;j++){
                if(arr[j] == 'a'){
                    count++;
            }
        }
            // System.out.println("count"+count);
            max = Math.max(max,count);
            // System.out.println("max"+max);
            count=0;
        
    }
    System.out.println(max);
}
}
