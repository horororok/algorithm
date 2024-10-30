const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    for(let val of str){
        if(/[A-Z]/.test(val)){
            process.stdout.write(val.toLowerCase())
        } else if(/[a-z]/.test(val)){
            process.stdout.write(val.toUpperCase())
        }
    }
});