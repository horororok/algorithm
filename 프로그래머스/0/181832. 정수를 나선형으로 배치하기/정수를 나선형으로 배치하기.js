function solution(n) {
    // 2차원 배열 초기화
    let ans = Array.from({ length: n }, () => Array(n).fill(0));
    
    let a = 1;
    let i = 0;
    let j = 0;
    
    // 4가지 방향: 오른쪽, 아래, 왼쪽, 위
    const directions = [
        [0, 1], // 오른쪽 (j++)
        [1, 0], // 아래 (i++)
        [0, -1], // 왼쪽 (j--)
        [-1, 0] // 위 (i--)
    ];
    let dir = 0; // 현재 방향: 0 -> 오른쪽, 1 -> 아래, 2 -> 왼쪽, 3 -> 위
    
    while (a <= n * n) {
        ans[i][j] = a;
        a++;
        
        // 다음 위치 계산
        let ni = i + directions[dir][0];
        let nj = j + directions[dir][1];
        
        // 범위 밖이거나 이미 값이 들어있는 경우 방향 전환
        if (ni < 0 || ni >= n || nj < 0 || nj >= n || ans[ni][nj] !== 0) {
            // 방향 전환
            dir = (dir + 1) % 4;
            ni = i + directions[dir][0];
            nj = j + directions[dir][1];
        }
        
        // i, j 갱신
        i = ni;
        j = nj;
    }
    
    return ans;
}
