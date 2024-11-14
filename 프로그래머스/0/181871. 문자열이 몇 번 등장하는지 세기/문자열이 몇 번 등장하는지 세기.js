function solution(myString, pat) {
    let ans = 0;
    let str = myString;
    
    while (str.includes(pat)) {
        str = str.slice(str.indexOf(pat) + 1); // pat의 시작 위치 이후부터 잘라서 str 갱신
        ans++; // pat을 찾을 때마다 카운트 증가
    }
    
    return ans;
}
