package programmers.CT_foundation.day14.P181886;
/**
 * Class: P181886
 *
 * @author lyckabc
 * @date 2024-07-20 23:12
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181886 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(names)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] names) {
        int lenGr = names.length;
        String[] answer = new String[lenGr % 5 == 0 ? lenGr / 5 : lenGr /5 + 1];
        for (int i = 0; i < lenGr; i++) {
            if (i % 5 == 0) {
                answer[i / 5] = names[i];
            }
        }
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        int size = names.length / 5;
        if(names.length % 5 != 0){
            size += 1;
        }
        answer = new String[size];
        int idx = 0;
        for(int i = 0; i < size; i++){
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}
 */