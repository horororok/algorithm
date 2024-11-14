function solution(arr1, arr2) {
    // 길이가 다르면 길이가 더 긴 배열을 우선 반환
    if (arr1.length > arr2.length) {
        return 1;
    } else if (arr1.length < arr2.length) {
        return -1;
    }

    // 길이가 같으면 합계를 비교
    const sum1 = arr1.reduce((acc, cv) => acc + cv, 0);
    const sum2 = arr2.reduce((acc, cv) => acc + cv, 0);

    if (sum1 > sum2) {
        return 1;
    } else if (sum1 < sum2) {
        return -1;
    } else {
        return 0;
    }
}
