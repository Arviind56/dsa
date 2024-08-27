import java.util.*;
public class ryhymn2 {
    public static String match(String []arr,String k){
        Map<Integer,String> map =new HashMap<>();

        int max =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int n1 = arr[i].length();
            if(arr[i].contentEquals(k)){
                continue;
            }
            else{
                int l = mach(arr[i],k);
                map.put(l,arr[i]);
                if(l>max){
                    max = l;
                }
            }


        }
        if(max!=0){
            return map.get(max);
        }
        else{
            return "no words found";
        }

    }
    public static int mach(String a,String b){
        int n = Math.min(a.length(),b.length());
        int count =0;
        for(int i=0;i<n;i++){
            if(a.charAt(a.length() - i -1) == b.charAt(b.length() - i - 1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String k = sc.next();
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        System.out.println(match(arr,k));
    }
}
