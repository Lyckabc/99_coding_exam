class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int answer = Integer.parseInt(parts[0]);
        
        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            int num = Integer.parseInt(parts[i + 1]);

            switch (op) {
                case "+" : answer += num;
                break;
                case "-" : answer -= num;
                break;
                case "*" : answer *= num;
                break;
            }
        }
        
        return answer;    
    }
}