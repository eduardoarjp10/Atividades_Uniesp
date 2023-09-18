package Aula02.Exercício4;

import java.util.Scanner;

public class Media {
    double nota1 = 0.0;
    double nota2 = 0.0;
    double nota3 = 0.0;

    Scanner sc = new Scanner(System.in);

    public void CalcularMedia(){
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        if(media >= 7){
            System.out.println("O aluno foi aprovado com uma media de " + media);
        }else{
            System.out.println("O aluno foi reprovado com uma media de " + media);
        }
    }
}
