import java.util.*;
public class replacingcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char s1 = sc.next().charAt(0);
        char s2 = sc.next().charAt(0);
        char arr[] = str1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == s1){
                arr[i] = s2;
            }
            else if(arr[i] == s2){
                arr[i] = s1;
            }

        }
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
        
        


    }
}
