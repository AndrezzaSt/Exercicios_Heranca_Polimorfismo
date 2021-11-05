package Classes;

import java.util.Locale;

public class Administrativo extends Assistente{
    private String turno = "dia";
    private final double bonus_noturno = 70.00;
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getBonus_noturno() {
        return bonus_noturno;
    }


    public Administrativo(String name, String time, double salario, int CPF, int numero_matricula, String turno) {
        super(name, time, salario, CPF, numero_matricula);
        this.turno = turno;
    }

    @Override
    public void Calculo_Salario(int horas) {
        double bonus = 0;
        if(getTurno() == "noite") {
            bonus = bonus + getBonus_noturno() * horas;
        }
            setSalario(getSalario() + bonus);
    }

}
