package CLasses_Ex3;

public class Ingresso {
    private double valor = 10.00;
    private double valor_adicional;


    public double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double imprime_valor() {
        return getValor() + valor_adicional;
    }
}
