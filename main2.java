class main2 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        boolean dp[][] = new boolean[s.length()][s.length()];
        int start = 0;
        int maxLength = 1;

        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }

                if (dp[i][j] && g + 1 > maxLength) {
                    start = i;
                    maxLength = g + 1;
                }
        }
    }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        main2 main2 = new main2();
        String input = "cbbd";
        System.out.println("Longest Palindromic Substring: " + main2.longestPalindrome(input));
    }
}
