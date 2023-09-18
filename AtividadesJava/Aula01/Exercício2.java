package Aula01;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        
        System.out.println("Digite sua nota: ");
        double nota2 = sc.nextDouble();

        
        System.out.println("Digite sua nota: ");
        double nota3 = sc.nextDouble();
        

        double Media = (nota + nota2 + nota3)/3;

        System.out.println("A media do aluno foi de " + Media);


        
        sc.close();
    }
}
