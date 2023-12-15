package N121;

import java.io.*;
import java.util.*;

public class N121 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {2,4,1};
        int output1 = sol.maxProfit(prices1);
        System.out.println("output1 : " + output1);

        int[] prices2 = {7,6,4,3,1};
        int output2 = sol.maxProfit(prices2);
        System.out.println("output2 : " + output2);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int profit = 0;
        int Mini ;
        int Maxi ;
        ArrayList<Integer> trade = new ArrayList<>();
        for (int num : prices) {
            trade.add(num);
        }
        int[] rebuild = Arrays.copyOfRange(prices,0,prices.length);

        while (rebuild.length > 0) {
            Mini = MaxMin(rebuild)[0];
            Maxi = MaxMin(rebuild)[1];

             if (trade.indexOf(Mini) == trade.size()-1) {
                 rebuild = Arrays.copyOfRange(rebuild,  0, FindIdx(rebuild, Mini)-1);
             } else if (trade.indexOf(Maxi) < trade.indexOf(Mini) ) {
                rebuild = Arrays.copyOfRange(rebuild,  FindIdx(rebuild, Maxi)+ 1, rebuild.length);
            } else {
                return Maxi-Mini;
            }
        }

        return profit;
    }

    private int[] MaxMin(int[] rebuild) {
        int Mini = rebuild[0];
        int Maxi = rebuild[0];

        for (int i = 0; i < rebuild.length; i++) {
            if (rebuild[i] >= Maxi) {
                Maxi = rebuild[i];
            }
            if (rebuild[i] <= Mini ) {
                Mini = rebuild[i];
            }
        }
        int[] out = new int[2];
        out[0] = Mini;
        out[1] = Maxi;
        return out;
    }
    private int FindIdx(int[] arr, int value) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}