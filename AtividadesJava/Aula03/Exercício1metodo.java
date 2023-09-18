package Aula03;

public class Exercício1metodo {

    private double peso;
    private double altura;
    
    public ex01Metodo(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void IMC(){
        double imc = peso/(altura*altura);
        System.out.println("O imc do individuo é de: " + imc);    
    }

    
    
    
    
}
