class Solution {
    public int solution(int price) {
        double sale = 0;
        if (price >= 500000) {
            sale = (double) price * 0.8;
        } else if (price < 500000 && price >= 300000) {
            sale = (double)price * 0.9;
        } else if (price < 300000 && price >= 100000) {
            sale = (double) price * 0.95;
        } else {
            sale = (double) price;
        }
        return (int) sale;
    }
}