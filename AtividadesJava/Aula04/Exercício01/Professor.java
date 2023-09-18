package Aula04.Exercicio01;

public class Professor {
    
    private String nome;
    private int idade;
    private String especializacao;
    private double salario;

    

    public Professor(String nome, int idade, String esp, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.especializacao = esp;
        this.salario = salario;
    }

    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ExibirDados(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Profissão: " + this.especializacao);
        System.out.println("Salario: " + this.salario);
    }
}
