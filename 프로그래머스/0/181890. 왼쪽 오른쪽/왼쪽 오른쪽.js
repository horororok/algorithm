function solution(str_list) {
    let arr = [...str_list];
    for(let i= 0; i<arr.length; i++){
        if(arr[i]==='l'){
            return arr.slice(0, i);
        } else if (arr[i]==='r'){
            return arr.slice(i+1)
        } else{
            continue;
        }
    }
    return [];
}