package Classes;

public class Funcionario {
    private String name;
    private String time;
    private double salario;
    private int CPF;


    public Funcionario() {
    }

    public Funcionario(String name, String time,double salario, int CPF) {
        this.name = name;
        this.time = time;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void Calculo_Salario(int horas){
        setSalario(getSalario());
    }
    public void ExibeDados(){}


}
