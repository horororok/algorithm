function solution(sizes) {
    let temp = sizes.map((e)=>e.sort((a,b)=>a-b));
    let w=0;
    let h = 0;
    for(let [a, b] of temp){
        if(a>w){
            w=a
        }
        if(b>h){
            h=b
        }
    }
    return w*h
}