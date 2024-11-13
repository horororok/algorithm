function solution(todo_list, finished) {
    let arr = [...todo_list];
    return arr.filter((_,i)=>finished[i]===false)
}