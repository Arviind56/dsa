// import java.util.*;
// public class vampire{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         // int arr[] = new int[n];
//         String s = sc.next();
//         char arr1[] = s.toCharArray();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = arr1[i] - '0';
//             }
//             // sc.close();
//         Arrays.sort(arr);
//         int sum = Arrays.stream(arr).sum();
//         int res =0;
//         res = arr[n-1];
//         int t=2;
//         while(res <= sum - res){
//             res = res + arr[n-t];
//             t++;
//         }
//         System.out.println(res);
            
//     }
// }