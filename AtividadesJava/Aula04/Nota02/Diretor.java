package Aula04.Nota02;

import java.util.Scanner;

public class Diretor extends Funcionario {

    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
        //TODO Auto-generated constructor stub
    }

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }


    Scanner sc =  new Scanner(System.in);
    public void acoes(){
        System.out.println("Digite a quantidade de ações da empressa: ");
        this.acoes = sc.nextInt();
    }
    public void ExibiDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Ações: " +  this.acoes);

    }
}
