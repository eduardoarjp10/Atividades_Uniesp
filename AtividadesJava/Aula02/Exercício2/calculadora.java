package Aula02.Exercício2;

import java.util.Scanner;

public class calculadora {
    
    
    public void calc(){
        
        Scanner sc = new Scanner(System.in);
        int x;
        do{
            System.out.println("1 somar \n 2 subtrair \n 3 multiplicar \n 4 dividir"); 
            System.out.println("Digite a opção desejada:");
            x = sc.nextInt();
            
            switch(x){
                case 1:
                System.out.println("Digite o primeiro numero: ");
                double n1 = sc.nextDouble();
        
                System.out.println("Digite o segundo numero: ");
                double n2 = sc.nextDouble();
        
                double somar = n1 + n2;
        
                System.out.printf("O resultado da soma é de: %s \n", somar);
                
                break;
                case 2:
                System.out.println("Digite o primeiro numero: ");
                double n3 = sc.nextDouble();
            
                System.out.println("Digite o segundo numero: ");
                double n4 = sc.nextDouble();
            
                double subtrair = n3 - n4;  
            
                System.out.printf("O resultado da subtração é de %s \n", subtrair);

                break;

                case 3:
                System.out.println("Digite o primeiro numero: ");
                double n5 = sc.nextDouble();
            
                System.out.println("Digite o segundo numero: ");
                double n6 = sc.nextDouble();
            
                double multiplicar = n5 * n6;
            
                System.out.printf("O resultado da multiplicação é de: %s \n", multiplicar);
    
                break;

                case 4:
                System.out.println("Digite o primeiro numero: ");
                double n7 = sc.nextDouble();
            
                System.out.println("Digite o segundo numero: ");
                double n8 = sc.nextDouble();
            
                double dividir = n7 / n8;
            
                System.out.printf("O resultado da divisão é de: %s \n", dividir);
            }
            
        }while(x==0);

        sc.close();
    
    }

}
