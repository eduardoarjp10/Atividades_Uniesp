const readline = require('readline')
const r3 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

//salario incial em 95
var Salarinicial = parseFloat(1000);

//Reajuste salarial em 96
var PrimeiroReajuste = parseFloat(1.5/100);

//Reajuste salarial em 97
var Ajuste97 =parseFloat(3/100);

var Salario96 = parseFloat(Salarioinicial + (Salarioinicial * PrimeiroReajuste));
var Sa96 = Salario96 * 12;
console.log(`O salario do funcionario em 96 era 1000, e mudou para  ${Salario96} \n`  
+`Assim, a sua renda anual será ${Sa96}`)

var Salario97 = parseFloat(Salarioinicial + (Salarioinicial*AjusteFinal));
var Sa97 = Salario97 * 12;
console.log(`O Salario do funcionário no ano de 1997. passou de ${Salario96}, \n para ${Salario97}, dando uma renda anual de ${Sa97}\n\n\n`)


r3.question("Digite seu salario incial: ", (enter) =>{
    const SalarioAT = parseFloat(enter)

    var SalarioF = parseFloat(SalarioAT + (SalarioAT * Ajuste97))
    var sfa = SalarioF * 12
    console.log(`O seu salario incial, era ${SalarioAT}, e passou para ${SalarioF} \n
    Assim, sua renda anual é  ${sfa}`)
})
