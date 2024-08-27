import java.util.*;
public class vowelscount {
    public static int factorial(int num){
        if(num ==0 || num == 1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String str1 = str.toLowerCase();
        char arr[] = str1.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                count++;}
        }
        System.out.print(factorial(count));

    }
}
