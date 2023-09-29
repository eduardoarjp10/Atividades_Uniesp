//Gerando Interface
const readline = require('readline');
const r2 = readline.createInterface({
    input: process.stdin, 
    output: process.stdout
})

//variaveis do Script
var mn = Infinity;
var mN = -Infinity;
var n = 0;

//função para usar a Interface
function sN(){
    r2.question("Digite um numero: ", (enter) =>{
        const numero = parseInt(enter);

        //verificação se o número é valido
        if (!isNaN(numero)) {

            //condições para definir se o numero é maior ou menor
            if(numero < mn){
                mn = numero;
            }
            if(numero > mN){
                mN = numero;
            }
            
            //criando um contador
            n++;
            //condição caso o contador seja menor que 10 ele fique repetindo
            if(n < 10){
                sN(); 
                //caso a condição seja superada, os dados apresentados serão inseridos
            } else {
                console.log(`O menor numero digitado foi: ${mn}`)
                console.log(`O maior numero digitado foi: ${mN}`)
                r2.close();
            }
        } else {
            console.log('Número inválido.');
            sN(); 
        }
    })
}

sN();
