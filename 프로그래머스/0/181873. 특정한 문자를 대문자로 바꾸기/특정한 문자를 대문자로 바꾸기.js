function solution(my_string, alp) {
    return [...my_string].map((el)=>[el].includes(alp)?el.toUpperCase():el).join('')
}