function solution(my_string, index_list) {
    let res = [];
    for(let val of index_list){
        res.push(my_string[val]);
    }
    return res.join('');
}