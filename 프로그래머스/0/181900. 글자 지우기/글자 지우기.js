function solution(my_string, indices) {
    return [...my_string].filter((e,i)=>!indices.includes(i)).join('')
}