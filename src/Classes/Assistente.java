package Classes;

public class Assistente extends Funcionario{
    private int numero_matricula;



    public Assistente(int numero_matricula) {
    }

    public Assistente(String name, String time, double salario, int CPF, int numero_matricula) {
        super(name, time, salario, CPF);
        this.numero_matricula = numero_matricula;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }
    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    @Override
    public void ExibeDados(){}
}
