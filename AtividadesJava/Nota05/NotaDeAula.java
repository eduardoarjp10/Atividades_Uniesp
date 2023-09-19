package Aula05;

public class NotaDeAula {
    
    private String marca;
    private String nome;

    public NotaDeAula(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Status(){
        System.out.println("A marca do carro é " + marca + " Nome: " + nome);
    }
    
}
