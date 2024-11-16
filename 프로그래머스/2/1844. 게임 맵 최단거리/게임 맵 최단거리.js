function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;

    // 상, 하, 좌, 우로 이동할 방향 (4방향)
    const directions = [
        [-1, 0], // 위
        [1, 0],  // 아래
        [0, -1], // 왼쪽
        [0, 1]   // 오른쪽
    ];

    // BFS 탐색을 위한 큐 초기화
    const queue = [[0, 0]]; // 시작점 (0, 0)
    maps[0][0] = 0; // 시작점 방문 처리 (방문 여부를 maps 배열에서 체크)
    
    // BFS 탐색
    let steps = 1; // 시작점부터 첫 번째 단계는 1로 설정
    
    while (queue.length > 0) {
        const size = queue.length;
        
        for (let i = 0; i < size; i++) {
            const [x, y] = queue.shift();
            
            // 목표 지점에 도달한 경우
            if (x === n - 1 && y === m - 1) {
                return steps;
            }
            
            // 4방향으로 이동
            for (const [dx, dy] of directions) {
                const nx = x + dx;
                const ny = y + dy;
                
                // 맵의 범위를 벗어나지 않도록 확인하고, 벽이 아니고 방문하지 않은 곳이라면 이동
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] === 1) {
                    maps[nx][ny] = 0; // 방문 처리
                    queue.push([nx, ny]); // 큐에 새로운 위치 추가
                }
            }
        }
        
        // 각 레벨(단계)을 지나갈 때마다 steps를 증가시킴
        steps++;
    }

    // 목표 지점에 도달할 수 없는 경우
    return -1;
}
