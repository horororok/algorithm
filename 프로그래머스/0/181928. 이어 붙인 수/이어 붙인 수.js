function solution(num_list) {
    let a1='';
    let a2='';
    for(let val of num_list){
        if(val%2!==0){
            a1 += String(val);
        }else {
            a2+=String(val);
        }
    }
    return Number(a1)+Number(a2);
}