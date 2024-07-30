package programmers.CT_basic.day19.P120912;
/**
 * Class: P120912
 *
 * @author lyckabc
 * @date 2024-07-28 23:50
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120912 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {7,77,17};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(array));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i <array.length; i++) {
            int tmp = array[i];
            while (tmp > 0) {
                if (tmp % 10 == 7) {
                    answer++;
                }
                tmp /= 10;
            }
        }
        return answer;
    }
}
/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
}
 */
/*
class Solution {
    public int solution(int[] array) {
        int svn = 0;
        String str = "";

        for(int i=0; i<array.length; i++){
            str += array[i];
        }

        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals("7")) svn++;
        }

        return svn;
    }
}
 */