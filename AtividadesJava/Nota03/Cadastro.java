package Nota03;

import java.util.Scanner;

public class cadastro {
    private int codigo;
    private String nome;
    public int quantidade;
    private int x;

    Scanner sc = new Scanner(System.in);

    public cadastro(final int codigo, final String nome, final int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(final int quantidade) {
        this.quantidade = quantidade;
    }

    public void Vender(){
        
        do {
            System.out.println("1: vender");
            System.out.println("0: processo encerrado");
            System.out.println("Oque deseja: ");
            int x = sc.nextInt();
            
                switch (x) {
                    case 1:
                    System.out.println("A quantidade que deseja comprar: ");
                    int y = sc.nextInt();
                        int c = quantidade - y;
                        if(quantidade >=0){
                            
                            System.out.println("Voce vendeu " + y + " resta " + c);
                        }else{
                            System.out.println("Quantidade superior a disponivel");
                        }
                        break;
                    case 0:
                        System.out.println("operação encerrada!!");
                    default:
                        break;
                }
        }while (x == 0); //colocando um loop no codigo
        sc.close();
    }
    

}
