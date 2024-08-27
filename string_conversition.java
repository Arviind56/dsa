import java.util.*;
public class string_conversition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int count =0;
        String ans = "";
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='1'){
                count++;
            }
            else{
                ans += (char)(64+count);
                count = 0;
            }
        }
        if(count > 0 ){
            ans += (char)(64+count);
        }
        System.out.println(ans);
    }
    
}
