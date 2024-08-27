import java.util.*;
public class rhymnwords {
    public static String match(String k,String d[]){
        Map<Integer,String> p = new HashMap<>();
        int max =0;
        int n = d.length;
        for(int i=0;i<n;i++){
            if(d[i].contentEquals(k)){
                continue;
            }
            else{
                int l = mach(d[i],k);
                if(l>max){max = l;}
                p.put(l,d[i]);
            }
            
        }
        if(max!=0)
        {
            return p.get(max);
        }
        else{
            return "no words found";
        }
        // return p.get(max);

    }
public static int mach(String a, String b){
    int count =0 ;
    int min  =  Math.min(a.length(),b.length());
    for(int j=0;j<min;j++){
        if(a.charAt(a.length()-j-1) == b.charAt(b.length()-j-1)){
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        System.out.println("the outpu is "+match(str2,arr));



    }
}
