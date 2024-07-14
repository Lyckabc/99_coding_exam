package B11725;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B11725 {
    static int[] parents;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] graph  = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer tn = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(tn.nextToken());
            int b = Integer.parseInt(tn.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        parents = sol.arrInArr(graph);
        for (int i = 2; i <= n ; i++) {
            System.out.println(parents[i]);
        }
    }
}

class Solution {
    static ArrayList<Integer>[] graph;
    static boolean[] isVisit;

    public int[] arrInArr(ArrayList<Integer>[] Graph) {
        graph = Graph;
        int n = B11725.n;
        B11725.parents = new int[n + 1];
        isVisit = new boolean[n + 1];
        dfs( 1);

        return B11725.parents;
    }
    private static void dfs(int idx) {
        isVisit[idx] = true;
        for (int i : graph[idx]) {
            if (!isVisit[i]) {
                B11725.parents[i] = idx;
                dfs(i);
            }
        }
    }
}
