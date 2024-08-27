// Type your code here
import java.lang.*;
import java.util.*;
public class digiwith9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String num = "";
        int n = arr.length;
        int count =0;
        boolean flag = false;
        for(int i=0;i<n;i++){
        if(Character.isDigit(arr[i].charAt(0)))
            {
                
                int n1 = arr[i].length();
                // int num1 = Integer.parseInt(arr[i]);
                for(int j=0;j<n1;j++){
                    if(arr[i].charAt(j) == '9'){
                        flag = true;
                        // break;
                    }
                    
                    
                }
                if(!flag){
                    count++;
                    num = arr[i];
                    // break;
                }
                flag = false;
                
            }
            
        }
            if(count == 0){
                System.out.print(-1);
            }
        
        
        System.out.print(num);
    }
}