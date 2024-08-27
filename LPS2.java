import java.util.*;
public class LPS2 {
    public static int main(String s){
        boolean  dp[][] = new boolean[s.length()][s.length()];
        int len=0;
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<dp.length;j++,i++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                }
            }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }

                }if(dp[i][j]){
                    len = g+1;
                }

            }
        }return len;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("PRINT THE STRING");
        System.out.println(main(s));
    }
}
