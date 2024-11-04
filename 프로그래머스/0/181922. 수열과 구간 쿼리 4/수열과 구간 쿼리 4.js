function solution(arr, queries) {
    let res = [...arr];
    for(let i = 0; i<queries.length; i++){
        let s = queries[i][0];
        let e = queries[i][1];
        let k = queries[i][2];
        for(let j = s; j<=e; j++){
            if(j%k===0){
                res[j]+=1;
            }
        }
    }
    return res;
}