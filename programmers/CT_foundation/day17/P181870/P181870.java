package programmers.CT_foundation.day17.P181870;
/**
 * Class: P181870
 *
 * @author lyckabc
 * @date 2024-07-31 12:09
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181870 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"and","notad","abcd"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(strArr)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] strArr) {
        String notContain = "";
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                notContain += strArr[i] + " "; 
            }    
        }
        String[] answer = notContain.split(" ");
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }
}
 */
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = Arrays.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
        String[] answer  = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}
 */
/*
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                al.add(s);
            }
        }
        return al.toArray(String[]::new);
    }
}

 */