function solution(strArr) {
    let groupCount = {};  // 문자열 길이를 키로 하는 객체
    
    // 각 문자열의 길이에 해당하는 그룹에 개수 추가
    for (let str of strArr) {
        let len = str.length;
        if (groupCount[len]) {
            groupCount[len] += 1;
        } else {
            groupCount[len] = 1;
        }
    }
    
    // 가장 큰 그룹 크기를 반환
    return Math.max(...Object.values(groupCount));
}
