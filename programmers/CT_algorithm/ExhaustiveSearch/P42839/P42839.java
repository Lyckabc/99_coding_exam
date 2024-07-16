package programmers.CT_algorithm.ExhaustiveSearch.P42839;

/**
 * Class: P42839
 *
 * @author lyckabc
 * @date 2024-07-15 18:18
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.HashSet;
import java.util.Set;
public class P42839 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String numbers = "011";

        long startTime = System.nanoTime();

        System.out.println(sol.solution(numbers));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

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
/* best code. but time double than mine.
 import java.util.HashSet;
class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

        public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }

}
 */
