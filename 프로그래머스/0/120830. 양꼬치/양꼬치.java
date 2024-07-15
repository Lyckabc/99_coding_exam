class Solution {
    private int lamb = 12000;
    private int drink = 2000;

    public int solution(int n, int k) {
        int answer = 0;
        int lambPrice = lamb * n;
        if (n >= 10) {
            k = k - n / 10;
        }
        int drinkPrice = drink * k;
        answer = lambPrice + drinkPrice;
        return answer;
    }
}