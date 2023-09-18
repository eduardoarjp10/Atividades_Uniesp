package Nota04;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Informações do veiculo: ");
        System.out.println("Informe qual veiculo você deseja cadastrar:");
        System.out.println("1: Carro\n2: Moto");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println("Informe a marca do veiculo: ");
                String marca = sc.nextLine();
                sc.nextLine();

                
                System.out.println("Informe o modelo do veiculo: ");
                String modelo = sc.nextLine();
                sc.nextLine();

                System.out.println("Informe o ano de fabricação: ");
                int ano = sc.nextInt();

                System.out.println("Informe a potencia do veiculo: ");
                int cv = sc.nextInt();

                Carro c1 = new Carro(marca, modelo, ano, cv);
                c1.ExibirDados();
                break;
            case 2:
                System.out.println("Informe a marca da moto: ");
                String marcaM = sc.nextLine();
                sc.nextLine();

                System.out.println("Informe o modelo da moto: ");
                String modeloM = sc.nextLine();
                sc.nextLine();

                System.out.println("Informe o ano de fabricação: ");
                int anoM = sc.nextInt();

                System.out.println("Informe a potencia da moto: ");
                int cc = sc.nextInt();

                Moto m1 = new Moto(marcaM, modeloM, anoM, cc);
                m1.ExibirDados();
                break;
            default:
                break;
        }
    }
}
