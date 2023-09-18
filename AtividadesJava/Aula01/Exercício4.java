package Aula01;
import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        
        System.out.println("Bem vindo a nossa loja");
        
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
                System.out.println("Fone de ouvido  \n Carregador de iphone \n Caixinha de som");
                break;
                case 2: 
                System.out.println("Fone de ouvido = R$20,00 \n Carregador de iphone R$15,00 \n Caixinha de som R$100,00"); 
                break;
                case 3:
                System.out.println("Forma de pagamento: \n Dinheiro \n Cartão");

            }
        }while(x==0);

        sc.close();

  
    }
}
