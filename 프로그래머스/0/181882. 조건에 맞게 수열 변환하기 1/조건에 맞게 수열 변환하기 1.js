function solution(arr) {
    let ans = [];
    for(let val of arr){
        if(val%2===0 && val>=50){
            ans.push(val/2)
        } else if(val%2!==0 && val<50){
            ans.push(val*2)
        } else{
            ans.push(val)
        }
    }
    return ans
}