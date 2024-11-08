function solution(n) {
    let res = [n];
    let el = n;
    while(el !== 1){
        if(el%2===0){
            el /=2;
            res.push(el);
        } else{
            el = el*3+1;
            res.push(el);
        }
    }
    return res;
}