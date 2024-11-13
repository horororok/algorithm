function solution(intStrs, k, s, l) {
    let ans = [];
    for(let el of intStrs){
        let trans = Number(el.slice(s, s+l));
        if(trans>k){
            ans.push(trans);
        }
    }
    return ans    
    
}