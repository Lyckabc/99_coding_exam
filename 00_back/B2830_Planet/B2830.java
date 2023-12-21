package B2830;

import java.io.*;
import java.util.*;

public class B2830 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Solution sol = new Solution();

        int[] names = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = Integer.parseInt(br.readLine());
        }

        long Affinity = sol.planet(names);

        System.out.println(Affinity);
    }
}

class Solution {
    public long planet(int[] arr) {
        Arrays.sort(arr);
        long value = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                value += arr[i] ^ arr[j];
                //System.out.println("value, i, j :" + value + " "+ i + " " + j);
                System.out.println("arr[i] : arr[j] " + arr[i] + " =  : "+ arr[j] );
            }
        }
        return value;
    }
}