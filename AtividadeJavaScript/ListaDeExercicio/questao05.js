const readline = require('readline');
const r4 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var pi = 3.14;

r4.question("Digite o raio da circunferencia: ", (enter)=>{
    var raio = parseFloat(enter);

    var area = raio**2 *pi

    console.log(`${areaC}`)
})
