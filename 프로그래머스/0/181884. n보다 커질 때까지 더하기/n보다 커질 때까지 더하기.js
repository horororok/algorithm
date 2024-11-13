function solution(numbers, n) {
    let ans = 0;
    for(let val of numbers){
        ans+= val;
        if(ans>n){
            return ans
        }
    }
}