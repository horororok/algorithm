function solution(num_list, n) {
    let arr = [...num_list];
    return [...arr.slice(n), ...arr.slice(0, n)]
}