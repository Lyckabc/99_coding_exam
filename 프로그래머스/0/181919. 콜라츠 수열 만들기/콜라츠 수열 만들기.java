import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> collatzList = new ArrayList<>();
        while (n != 1) {
            collatzList.add(n);
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }
        collatzList.add(n);
        return collatzList.stream().mapToInt(i -> i).toArray();
    }
}