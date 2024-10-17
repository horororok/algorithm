// 최대공약수
function gcd (a, b){
    // 유클리드 호제법 이용
    // b가 0이 될때까지 재귀적으로 호출, b가 0이 되면 a가 최대공약수
    return b === 0 ? a : gcd(b, a%b);
}

// 최소공배수
function lcm (a, b){
    // 두 수의 곱을 둘의 최대공약수로 나눠서 구한다.
    return (a*b)/gcd(a,b)
}

// 여러 수의 최소공배수
function lcmMultiple (numbers){
    //reduce로 배열의 첫번째 값부터 마지막 값까지 최소공배수를 구해준다.
    // acc는 누적된 최소공배수, curr은 현재 배열의 값
    return numbers.reduce((acc, curr)=>lcm(acc,curr));
}

function solution(numer1, denom1, numer2, denom2) {
    
    let denoms = [denom1, denom2]; // 분모들을 배열에 담아줌
    let denom = lcmMultiple(denoms); // 두 분모의 최소공배수를 구함
    let numer = (denom/denom1)*numer1 + (denom/denom2)*numer2; // 최소공배수를 이용해 분자 계산
    
    // 약분을 위해 분자와 분모의 최대공약수 구하기
    let gcdValue = gcd(numer, denom);
    
    // 분자와 분모를 최대공약수로 나누어 약분
    numer /= gcdValue;
    denom /= gcdValue;
    
    let answer = [numer, denom];
    
    return answer;
}