function gcd(a, b) {
    if (b == 0) return a;
    else return gcd(b, a % b);
}

function solution(numer1, denom1, numer2, denom2) {
    var gcd_denu = gcd(denom1, denom2);
    var nu1 = numer1 * denom2;
    var nu2 = numer2 * denom1;
    var answer = [(nu1 + nu2) / gcd_denu, (denom1 * denom2) / gcd_denu];
    return answer;
}

function main() {
    // 주어진 예제값 (2, 8, 2, 8)을 사용하여 solution 함수 호출
    var result = solution(2, 8, 2, 8);
    
    // 결과 출력
    console.log('Result:', result);
}

// main 함수 호출
main();