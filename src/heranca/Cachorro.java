package heranca;

public class Cachorro extends Animal{

   public String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("au au motoboy");
    }
}
