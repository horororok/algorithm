function solution(arr, delete_list) {
    let ans = [];
    return arr.filter((e)=>!delete_list.includes(e))
}