package Classes_Ex2;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public String late() {
        return "latiu!";
    }

}
