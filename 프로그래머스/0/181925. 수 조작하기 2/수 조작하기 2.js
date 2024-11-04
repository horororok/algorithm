function solution(numLog) {
    let arr = [];
    for(let i = 1; i<numLog.length; i++){
        if(numLog[i]- numLog[i-1] === 1){
            arr.push('w')
        }else if(numLog[i]- numLog[i-1] === -1){
            arr.push('s')
        }else if(numLog[i]- numLog[i-1] === 10){
            arr.push('d')
        }else{
            arr.push('a')
        }
    }
    return arr.join('')
}