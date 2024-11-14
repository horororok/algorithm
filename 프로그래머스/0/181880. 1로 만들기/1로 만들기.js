function solution(num_list) {
    arr = [];
    ans= 0;
    for(let val of num_list){
        while(val!==1){
            if(val===1){
                break;
            }
            else if(val%2===0){
                val = val/2
                ans++
            }else{
                val = (val-1)/2
                ans++
            }
        }
    }
    return ans
}