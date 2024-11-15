function solution(a, b) {
    let isOddA=a%2!==0;
    let isOddB=b%2!==0;
    
    if(isOddA && isOddB){
        return Math.pow(a,2)+Math.pow(b,2)
    }else if(isOddA || isOddB){
        return 2*(a+b)
    }else{
        return Math.abs(a-b)
    }
    
}