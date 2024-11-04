function solution(a, d, included) {
    
    
    let arr = [];
    
    let res = 0;
    for(let i = 0; i<included.length; i++){
        arr[i] = a + (i*d);
        if(included[i]){
            res+=arr[i];
        }
    }
    
    
    return res;
    
}