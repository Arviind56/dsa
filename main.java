import java.util.*;
public class main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int init[] = new int[n];
        for(int i=0;i<n;i++){
            init[i]=sc.nextInt();
        }

        int acc[] = new int[n];
        for(int i=0;i<n;i++){
            acc[i]=sc.nextInt();
        }
        int alarm =0;
        int i=0;
        int sum =0;
        int p=0;
        while(alarm !=1){

            if(alarm !=1)
            {
                for (int j = 0; j < acc.length; j++) {
                    init[j] = init[j] + (p*acc[j]);
                }
                sum =0;
            }
            for(int k=0;k<init.length;k++){
                if(init[k] >= l){
                    sum  += init[k];
                    if(sum >= m){
                        alarm = 1;
                    }
                }
            }
        }
        for(int y=0;y<init.length;y++){
            System.out.println(init[y]);
        }

    }


}