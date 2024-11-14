function solution(num_list) {
    if(num_list.length>10){
        return num_list.reduce((acc, cV)=>acc+cV)
    }else{
        return num_list.reduce((acc,cV)=>acc*cV)
    }
}