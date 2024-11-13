function solution(arr) {
    let ans = [...arr];
    let temp = [];
    let res = 0;

    // ans와 temp가 다를 때 루프를 진행하도록 조건 수정
    while (ans.length !== temp.length || !ans.every((value, index) => value === temp[index])) {
        temp = [...ans];  // 현재 상태를 temp에 저장
        ans = ans.map(e => (e >= 50 && e % 2 === 0) ? e / 2 : (e < 50 && e % 2 !== 0 ? e * 2 + 1 : e));
        res++;
    }
    
    return res-1;
}
