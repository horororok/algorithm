function solution(friends, gifts) {
    const giftCount = {};
    const giftIndex = {};
    const nextMonthGifts = {};

    // 초기화
    friends.forEach(friend => {
        giftCount[friend] = {};
        friends.forEach(other => {
            if (friend !== other) giftCount[friend][other] = 0;
        });
        giftIndex[friend] = 0;
        nextMonthGifts[friend] = 0;
    });

    // 선물 기록 처리
    gifts.forEach(gift => {
        const [giver, receiver] = gift.split(' ');
        giftCount[giver][receiver]++;
        giftIndex[giver]++;
        giftIndex[receiver]--;
    });

    // 다음 달 선물 계산
    for (let i = 0; i < friends.length; i++) {
        for (let j = i + 1; j < friends.length; j++) {
            const friend1 = friends[i];
            const friend2 = friends[j];

            const gift1to2 = giftCount[friend1][friend2] || 0;
            const gift2to1 = giftCount[friend2][friend1] || 0;

            if (gift1to2 > gift2to1) {
                nextMonthGifts[friend1]++;
            } else if (gift1to2 < gift2to1) {
                nextMonthGifts[friend2]++;
            } else {
                if (giftIndex[friend1] > giftIndex[friend2]) {
                    nextMonthGifts[friend1]++;
                } else if (giftIndex[friend1] < giftIndex[friend2]) {
                    nextMonthGifts[friend2]++;
                }
                // 선물 지수도 같은 경우 아무도 선물을 받지 않음
            }
        }
    }

    // 가장 많은 선물을 받는 친구의 선물 수 반환
    return Math.max(...Object.values(nextMonthGifts));
}