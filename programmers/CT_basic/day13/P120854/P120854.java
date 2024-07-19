package programmers.CT_basic.day13.P120854;
/**
 * Class: P120854
 *
 * @author lyckabc
 * @date 2024-07-19 23:32
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120854 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strlist = {"We", "are", "the", "world!"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(strlist)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(String[] strlist) {
        int lenStr = strlist.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList)
        .mapToInt(String::length)
        .toArray();
    }
}
 */
/*
import java.util.*;

class Solution {
    public ArrayList solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(String str : strlist){
            answer.add(str.length());
        }

        return answer;
    }
}
 */