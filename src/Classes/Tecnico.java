package Classes;

public class Tecnico extends Assistente{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public Tecnico(String name, String time, double salario, int CPF, int numero_matricula, int bonus) {
        super(name, time, salario, CPF, numero_matricula);
        this.bonus = bonus;
    }

    public void Calculo_Salario(int horas) {
        setSalario(getSalario() + getBonus() * horas);
    }
}
