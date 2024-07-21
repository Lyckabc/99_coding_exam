class Solution {
    private int lenArr;
    public int solution(int[] arr) {
        int answer = 0;
        lenArr = arr.length;
        int[] curArr = arr.clone();
        int[] prevArr = arr.clone();
        while (true) {
            curArr = arrCalcul(curArr);
            answer++;
            if (isSame(curArr, prevArr)) {
                break;
            }
            prevArr = curArr.clone();
        }
        
        return answer - 1;
    }
    public int[] arrCalcul(int[] arr) {
        for (int i = 0; i < lenArr; i++) {
            int tmp = arr[i];
            if (tmp >= 50 && tmp % 2 == 0) {
                arr[i] = tmp / 2;
            } else if (tmp < 50 && tmp % 2 != 0) {
                arr[i] = tmp * 2 + 1;
            }
            
        }
        return arr;
    }
    public boolean isSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < lenArr; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}