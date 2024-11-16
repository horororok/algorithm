function solution(numbers, target) {
    
    // dfs 함수 정의
    function dfs(index, currentSum) {
        // 기저 조건: 배열의 끝에 도달했을 때, 합이 target과 일치하면 1을 반환
        if (index === numbers.length) {
            return currentSum === target ? 1 : 0;
        }
        
        // 두 가지 경우의 수를 재귀적으로 호출
        const addCase = dfs(index + 1, currentSum + numbers[index]);
        const subtractCase = dfs(index + 1, currentSum - numbers[index]);
        
        // 두 가지 경우의 결과를 합산하여 반환
        return addCase + subtractCase;
    }
    
    // dfs 함수 호출 후, 결과를 반환
    return dfs(0, 0);
}
