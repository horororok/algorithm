function solution(n_str) {
    let ans = [...n_str];
    for(let val of [...n_str]){
        if(val==='0'){
            ans.shift()
        }else {
            break;
        }
    }
    return ans.join('')
}