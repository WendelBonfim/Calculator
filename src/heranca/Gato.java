package heranca;

public class Gato extends Animal{
    public String raca;
    public Sexo sexo;

    public Gato(String nome, Integer idade, String raca, Sexo sexo) {
        super(nome, idade);
        this.raca = raca;
        this.sexo = sexo;

    }
}
