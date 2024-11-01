function solution(n) {

    if(n%2!==0){
            let ans=0;
        for(let i = 1; i<n+1;i+=2){
            ans+= i
        }
        return ans
    } else {
            let ans=0;
        for(let i = 0; i<n+1; i+=2){
            ans+= i*i
        }
        return ans
    }
}