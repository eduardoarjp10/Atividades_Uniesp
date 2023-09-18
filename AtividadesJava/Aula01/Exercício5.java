package Aula01;
import java.util.Scanner;

public class Exercío05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("informe seu numero de matricula: ");
        int matricula = sc.nextInt();

        System.out.println("Informe seu nome: ");
        String nome = sc2.nextLine();

        System.out.println("Informe seu salario bruto: ");
        double salarioB = sc.nextDouble();

        double SalarioF = salarioB - (salarioB *15)/100;

        double Dsalario = salarioB - SalarioF;

        System.out.printf("Numero de matricula: %s\n" + 
        "Nome do funcionario: %s\n" + 
        "Salario bruto: %s \n" + 
        "Salario final: %s \n" +
        "Diferença de salario dada pelo INSS: %s", matricula, nome, salarioB, SalarioF, Dsalario );
    }   
}
