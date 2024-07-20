package programmers.CT_foundation.day14.P181885;
/**
 * Class: P181885
 *
 * @author lyckabc
 * @date 2024-07-20 23:17
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181885 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(todo_list, finished)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                sb.append(todo_list[i]);
                sb.append(" ");
            }
        }
        String[] answer = sb.toString().split(" ");
        
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
}
 */
/*
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todoList, boolean[] finished) {
        return IntStream.range(0, todoList.length)
            .mapToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
            .filter(AbstractMap.SimpleEntry::getValue)
            .map(AbstractMap.SimpleEntry::getKey)
            .toArray(String[]::new);
    }
}
 */