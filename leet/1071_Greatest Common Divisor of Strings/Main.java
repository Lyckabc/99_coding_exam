import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("input alpha : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(gcdOfStrings(str1, str2));
    }

    // class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    answer.append(str1.charAt(i));
                }
            }
        }
        
        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < answer.length(); j++) {
                if (answer.charAt(i) == answer.charAt(j)){
                    answer.deleteCharAt(j);
                }
            }
        }
        return answer.toString();
    }
}