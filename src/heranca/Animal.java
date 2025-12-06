package heranca;

public class Animal {
    protected String nome;
    protected Integer idade;

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public void emitirSom(){
        System.out.println("o bixo faz qualquer som!");
    };
}
