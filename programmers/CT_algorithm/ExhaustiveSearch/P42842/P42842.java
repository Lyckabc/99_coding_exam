package programmers.CT_algorithm.ExhaustiveSearch.P42842;
/**
 * Class: P42842
 *
 * @author lyckabc
 * @date 2024-07-16 23:20
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P42842 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int brown = 24;
        int yellow = 24;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int brown, int yellow) {
        // brown + yellow = total
        // yellowWidth <= (width - 2);
        // yellowHeight <= (height - 2);
        // width >= height;
        // width * height = total;
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int height = 3; height <= Math.sqrt(total); height++) {
            if (total % height == 0) {
                int width = total / height;
                if (yellow == (width - 2) * (height - 2)) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }
}
// a는 카펫의 가로 + 세로입니다.
// b는 타일의 총 개수입니다.
// •카펫의 가로 + 세로, 즉 a를 한 변으로 하는 정사각형을 만든 후, 네 귀퉁이를 잘라냅니다. 네 귀퉁이를 잘라내면, 즉 - 4 * b를 하면 가운데에 정사각형 형태의 타일이 남습니다
// •그 결과 남는 가운데 정사각형의 한 변의 길이를 구하면, 그 길이가 가로와 세로의 길이 차이가 됩니다.
// •따라서 가로를 구하기 위해서는 가로와 세로의 합에 차이를 더해주고 2로 나누며, 세로는 차이를 빼고 2로 나누면 됩니다.
 */