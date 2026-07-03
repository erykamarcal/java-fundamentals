package javastudies.dataStructures.lists.employeeManagement.entities;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

    public String toString() {
        return id
                + ", "
                + nome
                + ", "
                + String.format("%.2f", salario);
    }
}
