package heranca;

public class MainHeranca {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pipo",10,"Pudlletoy");
        System.out.println("O nome do cachorro e  "+ cachorro.nome + "  a idade dele e "+ cachorro.idade + " e a raca e " + cachorro.raca);

        Gato gato = new Gato("Naja", 13,"Maine Coon",Sexo.FEMININO);
        System.out.println( "O nome do gato e "  + gato.nome + " a idade dele(a) e "+ gato.idade + " a raca dele e "+ gato.raca + "e é do sexo e  " + gato.sexo);
    }



}
