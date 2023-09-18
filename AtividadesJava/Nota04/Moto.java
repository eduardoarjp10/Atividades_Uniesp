package Nota04;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int anoDeFabricacao, int cilindradas) {
        super(marca, modelo, anoDeFabricacao);
        this.cilindradas = cilindradas;
        //TODO Auto-generated constructor stub
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public void ExibirDados(){
        System.out.println("Informações do veiculo:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoDeFabricacao());
        System.out.println("Potencia: " + cilindradas);
    }
}
