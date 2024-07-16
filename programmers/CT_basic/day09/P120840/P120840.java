package programmers.CT_basic.day09.P120840;
/**
 * Class: P120840
 *
 * @author lyckabc
 * @date 2024-07-16 17:30
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.math.BigInteger;
public class P120840 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int balls = 7;
        int share = 3;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(balls, share));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share).intValue();
        return answer;
    }
    public BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }
    public BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
/*
class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
조합 공식: 7C3 = 7! / (3! * (7-3)!)

	1.	초기 호출: S(7,3)
	•	share가 3, balls가 7일 때 호출됩니다.
	•	share가 0이 아니므로 재귀적으로 호출을 계속합니다.
	2.	재귀 호출: S(6,2)
	•	share가 2, balls가 6일 때 호출됩니다.
	•	share가 0이 아니므로 재귀적으로 호출을 계속합니다.
	3.	재귀 호출: S(5,1)
	•	share가 1, balls가 5일 때 호출됩니다.
	•	share가 0이 아니므로 재귀적으로 호출을 계속합니다.
	4.	재귀 호출: S(4,0)
	•	share가 0, balls가 4일 때 호출됩니다.
	•	share가 0이므로 결과를 1로 설정합니다.
	•	result = 1
	5.	역방향 처리: S(5,1)
	•	result는 1에서 시작합니다.
	•	result = result * balls / share = 1 * 5 / 1 = 5
	•	result = 5
	6.	역방향 처리: S(6,2)
	•	result = 5
	•	result = result * balls / share = 5 * 6 / 2 = 15
	•	result = 15
	7.	역방향 처리: S(7,3)
	•	result = 15
	•	result = result * balls / share = 15 * 7 / 3 = 35
	•	result = 35

조합 계산의 일반적 접근 방식

주어진 그림에서는 일반적인 조합 공식인  \frac{n!}{r!(n-r)!} 가 아닌 재귀적 접근을 통해 조합을 계산하고 있습니다. 이 과정에서 다음과 같은 점들을 추가적으로 이해해야 합니다:

	•	함수 호출 스택: 재귀 함수 호출을 통해 분할된 문제들이 함수 스택에 저장되고, 역순으로 계산이 처리됩니다.
	•	공식의 변형: 일반적인 조합 공식을 변형하여 재귀적으로 분할하고 계산합니다.
	•	중간 결과의 활용: 중간 결과를 저장하고, 이를 다음 계산 단계에 사용하여 최종 결과를 도출합니다.

위 과정을 이해하면, 주어진 조합 계산 코드가 어떻게 작동하는지 명확히 알 수 있습니다.
 */