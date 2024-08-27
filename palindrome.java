import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        // int i=0;
        int flag =0;
        int j=str.length()-1;
        for(int i=0;i<str.length();){
            if(str.charAt(i)!=str.charAt(j)){
                flag = 1;
                break;
        }
        else{
            i++;
            j--;
        }

    }
    if(flag == 0){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}
}
