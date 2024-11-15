function solution(order) {
    return order.reduce((acc, cv) => {
        if (cv.includes('americano') || cv.includes('anything')) {
            return acc + 4500;
        } else if (cv.includes('cafelatte')) {
            return acc + 5000;
        } else {
            return acc; // 조건에 맞지 않으면 누적값 그대로 반환
        }
    }, 0);
}
