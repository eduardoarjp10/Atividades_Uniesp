package Nota04;

public class Carro extends Veiculo {

    private int cavalos;

    public Carro(String marca, String modelo, int anoDeFabricacao, int cavalos) {
        super(marca, modelo, anoDeFabricacao);
        this.cavalos = cavalos;

        //TODO Auto-generated constructor stub
    }

    public int getcavalos() {
        return cavalos;
    }

    public void setcavalos(int cavalos) {
        this.cavalos = cavalos;
    }
    
    public void ExibirDados(){
        System.out.println("Informações do veiculo:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoDeFabricacao());
        System.out.println("Potencia: " + cavalos);
    }
}
