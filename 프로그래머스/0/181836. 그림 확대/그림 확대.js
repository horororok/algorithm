function solution(picture, k) {
    let temp =  picture.map(row => {
        return row.split('').map(char => char.repeat(k)).join('');
    })
    return temp.map((e)=>Array(k).fill(e)).flat()
}
