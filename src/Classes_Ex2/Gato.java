package Classes_Ex2;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public String miou() {
        return "Miou!";
    }
}
