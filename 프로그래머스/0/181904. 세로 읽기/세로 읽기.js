function solution(my_string, m, c) {
    let ans = [];
    let str = '';
    
    // my_string을 m 길이씩 나누어 ans 배열에 저장
    for (let i = 0; i < my_string.length; i += m) {
        ans.push(my_string.slice(i, i + m));
    }
    
    // 각 부분 문자열에서 c번째 문자를 가져와서 str에 추가
    for (let i = 0; i < ans.length; i++) {
        str += ans[i][c - 1];
    }
    
    return str;
}
