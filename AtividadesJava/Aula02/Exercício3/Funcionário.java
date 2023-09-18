package Aula02.Exercício3;

public class Funcionario {
    int matricula;
    String nome;
    double salario_Bruto;
    double NovoSalario;

    public Funcionario(int matricula, String nome, double salario_Bruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario_Bruto = salario_Bruto;
        this.NovoSalario = 0.0;
    }

    public void Calcular_INSS() {
        double Df = salario_Bruto - (salario_Bruto * 30) / 100;
        NovoSalario = salario_Bruto - Df; 
    }

    public void Status() {
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario bruto: " + salario_Bruto);
        System.out.println("Declaração do inss: " + NovoSalario);
    }
}
