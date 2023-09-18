package Aula04.Nota02;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Diretor\n2:Gerente");
        int cargo = sc.nextInt();

        switch (cargo) {
            case 1:
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                sc.nextLine();
                
                System.out.println("Salario: ");
                double salario = sc.nextDouble();
                
                System.out.println("Quantidade de ações: ");
                int acoes = sc.nextInt();

                Diretor d1 = new Diretor(nome, salario, acoes);
                d1.ExibiDados();
                break;
            case 2:
                System.out.println("Nome: ");
                String nomeG = sc.nextLine();
                sc.nextLine();
                System.out.println("Salario: ");
                double SalarioG = sc.nextDouble();
                sc.nextLine();
                System.out.println("Departamento: ");
                String dep = sc.nextLine();

                Gerente g1 = new Gerente(nomeG, SalarioG, dep);
                g1.AjusteSalarial();

                break;
            default:
                break;
        }
    }
}
