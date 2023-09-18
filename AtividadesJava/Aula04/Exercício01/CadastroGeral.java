package Aula04.Exercicio01;
import java.util.Scanner;


public class CadastroGeral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Cadastro do professor \n 2: Cadastro do Aluno");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                sc.nextLine();
                System.out.println("idade: ");
                int idade = sc.nextInt();
                System.out.println("especialização: ");
                String esp = sc.nextLine();
                System.out.println("Salario: ");
                double salario = sc.nextDouble();
                Professor p1 = new Professor(nome, idade, esp, salario);
                p1.ExibirDados();
                break;
            case 2:
                System.out.println("Nome: ");
                String nomeA = sc.nextLine();
                sc.nextLine();
                System.out.println("idade: ");
                int idadeA = sc.nextInt();
                System.out.println("Digite a sua primeira nota: ");
                double n1 = sc.nextDouble();
        
                System.out.println("Digite a sua segunda nota: ");
                double n2 = sc.nextDouble();

                CadastroAluno a1 = new CadastroAluno(nomeA, idadeA, n1, n2);
                a1.CacularMedia(n1, n2);
                a1.ExibirDados();
                break;
                        
            default:
                break;
        }
    }    
}
