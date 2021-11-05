package Classes_Ex4;

public class Novo extends Imovel{
    private int adicional;


    public Novo(String endereco, Double preco, int adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public double definir_preco_adicional() {
        double adicional = (getPreco()  * getAdicional()) / 100;
        return adicional;
    }
    @Override
    public double imprimir_preco() {
        return getPreco() + definir_preco_adicional();
    }

    @Override
    public String toString() {
        return "Endereco: " + getEndereco() + " Preço: " + getPreco() + " com preco adicinal de imovel novo de %" + getAdicional();
    }
}
