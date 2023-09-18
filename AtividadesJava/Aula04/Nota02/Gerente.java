package Aula04.Nota02;

public class Gerente extends Funcionario {

    private String Depatarmento;

    public Gerente(String nome, double salario, String Depatarmento) {
        super(nome, salario);
        this.Depatarmento = Depatarmento;
        //TODO Auto-generated constructor stub
    }

    public String getDepatarmento() {
        return Depatarmento;
    }

    public void setDepatarmento(String depatarmento) {
        Depatarmento = depatarmento;
    }
    
    public void AjusteSalarial(){
        double salario = getSalario() + (getSalario() * 10)/100;
        System.out.println("O novo salario do Gerente passou de R$" + getSalario() + " para R$" + salario);
    }
    
}
