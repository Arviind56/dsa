import java.util.*;
// COUNT LONGEST PLANDROMIC SUSTRING
public class lps{
    public static int main(String s){
        int count=0;
        boolean dp[][] = new boolean[s.length()][s.length()];

        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g ==0 ){
                    dp[i][j]=true;
                }
                else if(g ==1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j]=true;
                }
            }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
            }
            if(dp[i][j]){
                count++;
            }
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        sc.close();
        System.out.println(main(str));
    }
}