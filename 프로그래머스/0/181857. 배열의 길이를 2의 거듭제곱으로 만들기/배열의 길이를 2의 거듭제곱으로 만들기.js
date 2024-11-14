function solution(arr) {
    let ans = [...arr];
    let len = arr.length;
    
    // 배열의 길이가 2의 거듭제곱인지 확인
    let nextPowerOfTwo = Math.pow(2, Math.ceil(Math.log2(len)));
    
    // 배열의 길이가 2의 거듭제곱이 아니면, 길이를 맞추기 위해 0을 추가
    while (ans.length < nextPowerOfTwo) {
        ans.push(0);
    }
    
    return ans;
}
