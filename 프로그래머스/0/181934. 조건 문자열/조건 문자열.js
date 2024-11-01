function solution(ineq, eq, n, m) {
    if (ineq === '>' && eq === '=') return n >= m ? 1 : 0;
    if (ineq === '>' && eq === '!') return n > m ? 1 : 0;
    if (ineq === '<' && eq === '=') return n <= m ? 1 : 0;
    if (ineq === '<' && eq === '!') return n < m ? 1 : 0;
    return 0; // 예상치 못한 입력의 경우 0을 반환
}
