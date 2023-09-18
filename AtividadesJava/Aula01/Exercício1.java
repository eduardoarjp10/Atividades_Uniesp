package Aula01;
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario: ");
        double Salario = sc.nextDouble();
        if(Salario > 950 &&Salario <=1250 ){
            Salario = Salario + (Salario *10)/100;
            System.out.println("O salario do funcionario corresponde a " + Salario);
        }else if(Salario >= 1251 &&Salario <= 1500){
            Salario = Salario + (Salario * 15)/100;
            System.out.println("O salario do funcionario corresponde a " + Salario);
        }else if(Salario > 1500 &&Salario <=- 2100){
            Salario = Salario + (Salario + 20)/100;
            System.out.println("O salario do funcionario corresponde a " + Salario);
        }else if( Salario > 2100){
            Salario = Salario + (Salario + 25)/100;
            System.out.println("O salario do funcionario corresponde a " + Salario);
        }else{
            System.out.println("O valor não foi encontrado no nosso banco de dados");
        }
        

        sc.close();


    }
}
