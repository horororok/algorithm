function solution(l, r) {
    let res = [];
    for (let i = l; i <= r; i++) {
        let StringNum = String(i);
        let isValid = true;
        
        // 각 자리 숫자가 "5" 또는 "0"인지 확인
        for (let val of [...StringNum]) {
            if (val !== '5' && val !== '0') {
                isValid = false;
                break;
            }
        }
        
        // 조건을 만족하는 숫자만 배열에 추가
        if (isValid) {
            res.push(i);
        }
    }
    
    // 조건을 만족하는 숫자가 없다면 [-1] 반환
    return res.length > 0 ? res : [-1];
}
