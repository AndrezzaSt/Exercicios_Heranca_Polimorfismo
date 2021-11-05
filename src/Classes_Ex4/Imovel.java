package Classes_Ex4;

public class Imovel {
    private String endereco;
    private Double preco;

    public Imovel() {
    }

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double imprimir_preco() {
        return getPreco();
    }


    public String toString() {
        return "Endereco: " + getEndereco() + " Preço: " + getPreco();
    }
}
