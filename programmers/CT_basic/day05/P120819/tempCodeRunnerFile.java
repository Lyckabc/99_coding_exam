package P120819;

/**
 * Class: P120819_maxIceAmericano
 *
 * @author USER
 * @date 2024-07-14 18:32
 * Copyright (c) 2024 USER
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120819_maxIceAmericano {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 5500;

        for (int result : sol.solution(money)) {
            System.out.print(result + " ");
        }
    }
}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int iceAmericano = 5500;
        int cupOfCoffee = 0;
        int cash = 0;
        while (money >= iceAmericano) {
            money -= iceAmericano;
            cupOfCoffee++;
        }
        cash = money;
        answer[0] = cupOfCoffee;
        answer[1] = cash;
        return answer;
    }
}
