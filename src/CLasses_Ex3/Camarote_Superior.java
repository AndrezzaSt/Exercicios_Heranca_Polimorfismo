package CLasses_Ex3;

public class Camarote_Superior extends VIP{
    private double CS_valor_adicional = 50.00;

    public double getCS_valor_adicional() {
        return CS_valor_adicional;
    }

    public void setCS_valor_adicional(double CS_valor_adicional) {
        this.CS_valor_adicional = CS_valor_adicional;
    }

    @Override
    public double imprime_valor() {
        setValor_adicional(getCS_valor_adicional());
        return getValor() + getValor_adicional();
    }
}
