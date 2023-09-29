const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let numerosPares = 0;
let numerosImpares = 0;
let contador = 0;

function Num() {
    rl.question("Digite um número: ", (entrada) => {
        const numero = parseInt(entrada);

        if (!isNaN(numero)) {
            if (numero % 2 === 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

            contador++;

            if (contador < 10) {
                Num();
            } else {
                console.log(`A quantidade de números pares é: ${numerosPares}`);
                console.log(`A quantidade de números ímpares é: ${numerosImpares}`);
                rl.close();
            }
        } else {
            console.log('Número inválido.');
            Num();
        }
    });
}

Num();
