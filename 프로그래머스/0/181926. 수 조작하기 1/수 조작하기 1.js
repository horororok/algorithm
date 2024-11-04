function solution(n, control) {
    let cArr = control.split('');
    console.log(cArr)
    let ans = n;
    for(let val of cArr){
        if(val === 'w'){
            ans+=1
        }else if(val==='s'){
            ans-=1;
        }else if(val === 'd'){
            ans+=10;
        }else{
            ans-=10;
        }
    }
    return ans

}