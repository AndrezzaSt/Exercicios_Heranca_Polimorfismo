package Classes_Ex4;

public class Velho extends Imovel{
    private int desconto;


    public Velho(String endereco, Double preco, int desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double definir_desconto() {
        double adicional = (getPreco()  * getDesconto()) / 100;
        return adicional;
    }

    @Override
    public double imprimir_preco() {
        return getPreco() - definir_desconto();
    }
    @Override
    public String toString() {
        return "Endereco: " + getEndereco() + " Preço: " + getPreco() + " com desconto de imovel velho de %" + getDesconto();
    }
}
