// 1. Set과 Map을 활용한 방법
// function solution(array) {
//     const numMap = new Map();
//     const numSet = new Set(array);
    
//     // 각 숫자의 출현 횟수 계산
//     numSet.forEach(num => {
//         numMap.set(num, array.filter(x => x === num).length);
//     });
    
//     // 최대 출현 횟수 찾기
//     const maxCount = Math.max(...numMap.values());
    
//     // 최빈값 찾기
//     const modes = [...numMap].filter(([num, count]) => count === maxCount);
    
//     return modes.length === 1 ? modes[0][0] : -1;
// }

// 2. reduce를 사용한 방법
function solution(array) {
    const counts = array.reduce((acc, val) => {
        acc[val] = (acc[val] || 0) + 1;
        return acc;
    }, {});
    
    const maxCount = Math.max(...Object.values(counts));
    const modes = Object.entries(counts).filter(([num, count]) => count === maxCount);
    
    return modes.length === 1 ? parseInt(modes[0][0]) : -1;
}