package CLasses_Ex3;

public class VIP extends Ingresso{
    private double valor_VIP = 100.00;

    public double getValor_VIP() {
        return valor_VIP;
    }

    public void setValor_VIP(double valor_VIP) {
        this.valor_VIP = valor_VIP;
    }

    @Override
    public double imprime_valor() {
        setValor_adicional(getValor_VIP());
        return getValor() + getValor_adicional();
    }
}
