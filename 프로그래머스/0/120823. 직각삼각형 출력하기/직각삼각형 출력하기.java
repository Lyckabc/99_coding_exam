import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printN(i);
            System.out.println();
        }
    }
    public static void printN(int n) {
        System.out.print("*".repeat(n));
    }
}