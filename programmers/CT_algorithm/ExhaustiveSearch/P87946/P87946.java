package programmers.CT_algorithm.ExhaustiveSearch.P87946;
/**
 * Class: P87946
 *
 * @author lyckabc
 * @date 2024-07-19 01:17
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
import java.util.List;
public class P87946 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(k, dungeons));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int max;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0, visited);
        answer = max;
        return answer;
    }
    public void dfs(int k, int[][] dungeons, int depth, boolean[] visited) {
        int lenDungeons = dungeons.length;
        if (depth > max) {
            max = depth;
        }
        for (int i = 0; i < lenDungeons; i++) {
            if (visited[i] == false && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, depth + 1, visited);
                visited[i] = false;
            }
        }
    }
}
/*
class Solution {
    int dfs(int k, int[][] dungeons) {
        int cnt = 0;
        for(int[] d : dungeons) {
            int a = d[0], b = d[1];
            if(a <= k) {
                d[0] = 9999;
                cnt = Math.max(1 + dfs(k - b, dungeons), cnt);
                d[0] = a;
            }
        }
        return cnt;
    }
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        return dfs(k, dungeons);
    }
}
 */
/*
class Solution {
    public int max;
    public List<String> logs; // To store the logs of the DFS process
    
    public Solution() {
        this.max = 0;
        this.logs = new ArrayList<>();
    }
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        List<Integer> path = new ArrayList<>(); 
        dfs(k, dungeons, 0, visited, path);
        answer = max;
        return answer;
    }
    public void dfs(int k, int[][] dungeons, int depth, boolean[] visited, List<Integer> path) {
        int lenDungeons = dungeons.length;
        logs.add("Depth: " + depth + ", Remaining energy: " + k + ", Visited: " + arrayToString(visited) + ", Path: " + path.toString());
        if (depth > max) {
            max = depth;
        }
        for (int i = 0; i < lenDungeons; i++) {
            if (visited[i] == false && dungeons[i][0] <= k) {
                visited[i] = true;
                path.add(i);
                dfs(k - dungeons[i][1], dungeons, depth + 1, visited, path);
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
    private String arrayToString(boolean[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public List<String> getLogs() {
        return logs;
    }
}
 */