function solution(num_list) {
    let arr = [...num_list];
    if(num_list[num_list.length-1]>num_list[num_list.length-2]){
        arr.push(num_list[num_list.length-1] - num_list[num_list.length-2])
    }else{
        arr.push(num_list[num_list.length-1]*2)
    }
    return arr;
}