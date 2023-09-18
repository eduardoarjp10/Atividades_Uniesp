package Aula04.Exercicio01;

import java.util.Scanner;

public class CadastroAluno extends Professor {

    private double nota1;
    private double nota2;
    private double media;


    public CadastroAluno(String nome, int idade, double nota1, double nota2) {
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    Scanner sc = new Scanner(System.in);
    
    public void CacularMedia(double nota1, double nota2 ){

        this.media = (nota1 + nota2)/2;

        System.out.println("A media do aluno " + this.getNome() + " é de: " + this.media);
    }

    public void ExibirDados(){
        System.out.println("nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("nota 1: " + this.nota1);
        System.out.println("nota 2: " + this.nota2);
        System.out.println("Media " + this.media);
    }
    
    
}
