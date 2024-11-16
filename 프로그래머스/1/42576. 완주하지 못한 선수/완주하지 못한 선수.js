function solution(participant, completion) {
    const map = new Map();

    // 참가자 배열로 Map 초기화 (이름: 등장 횟수)
    participant.forEach((e) => {
        map.set(e, (map.get(e) || 0) + 1);
    });

    // 완주자 배열을 순회하며 Map에서 횟수 감소
    completion.forEach((e) => {
        if (map.get(e)) {
            map.set(e, map.get(e) - 1);
        }
    });

    // 완주하지 못한 사람 찾기
    for (const e of participant) {
        if (map.get(e) > 0) {
            return e;
        }
    }
}
