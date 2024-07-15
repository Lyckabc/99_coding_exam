import java.util.HashSet;
import java.util.Set;
class Solution {
    private Set<Integer> primes = new HashSet<>();

    public int solution(String numbers) {
        
        int[] nums = numbers.chars().map(Character::getNumericValue).toArray();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, 0);
        return primes.size();
    }

    public boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public void dfs(int[] nums, boolean[] visited, int current) {
        if (current > 0 && isPrime(current)) {
            primes.add(current);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(nums, visited, current * 10 + nums[i]);
                visited[i] = false;
            }
        }

    }
}