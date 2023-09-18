package Aula01;
import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        
        System.out.println("Seja bem vinda a nossa loja");
        
        Scanner sc = new Scanner(System.in);
        int x;
        do{

        
            System.out.println("Opção 0: Voltar ao menu principal");
            System.out.println("Opção 1: Comprar um produto");
            System.out.println("Opção 2: Valor do produto");
            System.out.println("Opção 3: forma de pagamento");

            System.out.println("Opção desejada: ");
            x = sc.nextInt();

            
            switch(x){
                case 1:
                System.out.println("Capinha iphone x \n Capinha iphone xr \n Capinha iphone 12");
                break;
                case 2: 
                System.out.println("Capinha iphone x = R$10,00 \n Capinha iphone xr R$15,00 \n Capinha ipho;ne 12 R$20,00"); 
                break;
                case 3:
                System.out.println("Qual seria a forma de pagamento: \n Dinheiro \n Cartão");

            }
        }while(x==0);

        sc.close();

  
    }
}
