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