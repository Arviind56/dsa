import java.util.*;
public class stringsperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str =  sc.nextLine();
        int k = sc.nextInt();
        String arr[] = str.split(" ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
