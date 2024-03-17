const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

function solution() {
    
    function star(n) {
        if (n <= 0) return ['*'];
        const prev = star(n-1);
        const m = 2**(n-1);
        let r = Array(m*2).fill('');
        for (let i=0; i<m*2; i++) r[i] += prev[i%m];
        for (let i=0; i<m; i++) r[i] += prev[i%m];
        for (let i=m; i<m*2; i++) r[i] += ' '.repeat(m);
        return r;
    }
    
    const N = Number(input[0]);
    for (let s of star(N)) console.log(s.trimEnd());
}

solution();