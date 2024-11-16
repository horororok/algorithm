function solution(answers) {
    // 수포자 정답 패턴
    const temp1 = [1, 2, 3, 4, 5];
    const temp2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const temp3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    const temp = [[], [], []];

    const len = answers.length;

    // 수포자 패턴 반복해서 답 생성
    for (let i = 0; i < len; i++) {
        temp[0].push(temp1[i % 5]);
        temp[1].push(temp2[i % 8]);
        temp[2].push(temp3[i % 10]);
    }

    // 정답 맞힌 횟수 카운트
    const ans1 = [0, 0, 0];
    answers.forEach((e, i) => {
        if (e === temp[0][i]) ans1[0]++;
        if (e === temp[1][i]) ans1[1]++;
        if (e === temp[2][i]) ans1[2]++;
    });

    // 최대 점수 계산 및 결과 반환
    const maxScore = Math.max(...ans1);
    return ans1.map((e, i) => (e === maxScore ? i + 1 : null)).filter((e) => e !== null);
}
