package programmers.CT_basic.day16.P120903;
/**
 * Class: P120903
 *
 * @author lyckabc
 * @date 2024-07-21 23:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120903 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s1, s2));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            answer += sameStr(str, s2);
        }
        
        return answer;
    }
    public int sameStr(String s1, String[] s2) {
        for (String str : s2) {
            if (s1.equals(str)) {
                return 1;
            }
        }
        return 0;
    }
}
/*
import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int)Arrays.stream(s2).filter(set::contains).count();
    }
}
 */
/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}
 */
/*
import java.util.HashSet;
import java.util.List;
class Solution {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
        return answer;
    }
}
 */