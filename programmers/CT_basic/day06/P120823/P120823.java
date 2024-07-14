package P120823;

/**
 * Class: P120823
 *
 * @author lyckabc
 * @date 2024-07-14 23:46
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */

import java.util.Scanner;

public class P120823 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long startTime = System.nanoTime();

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            printN(output,i);
        }
        System.out.print(output);

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }

    public static void printN(StringBuilder output,int i) {
        // System.out.print("*".repeat(n));
        output.append("*".repeat(i)).append("\n");
    }

}
