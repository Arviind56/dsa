import java.util.Scanner;

public class lowercaseadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String str1 = "abcdesghijklmnopqrstuvwxyz"; // corrected string

        for (char c : str.toCharArray()) {
            if (str1.contains(Character.toString(c))) {
                sb.append(c);
                count++;
            }
        }

        sb.append(":").append(count);
        System.out.println(sb.toString());

        sc.close();
    }
}
