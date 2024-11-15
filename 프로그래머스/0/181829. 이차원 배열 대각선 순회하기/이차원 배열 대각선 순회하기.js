function solution(board, k) {
    let ilen=board.length;
    let jlen = board[0].length
    let ans = 0
    for(let i=0; i<ilen; i++){
        for(let j =0; j<jlen; j++ ){
            if(i+j<=k){
                ans+=board[i][j]
            }
        }
    }
    return ans
}