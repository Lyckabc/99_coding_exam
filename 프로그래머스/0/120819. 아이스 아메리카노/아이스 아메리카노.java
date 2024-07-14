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
