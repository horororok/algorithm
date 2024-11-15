function solution(a, b) {
    // BigInt를 사용하여 큰 수를 정확하게 처리
    let a1 = BigInt(a);
    let b1 = BigInt(b);
    return (a1 + b1).toString(); // 결과를 문자열로 반환
}
