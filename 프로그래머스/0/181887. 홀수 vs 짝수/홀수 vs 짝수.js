function solution(num_list) {
    let arr = [...num_list];
    let odd = 0;
    let even = 0;
    for(let i = 0; i<arr.length; i++){
        if(i%2===0){
            odd+= arr[i]
        }else{
            even+= arr[i]
        }
    }
    return odd > even ? odd: even
}