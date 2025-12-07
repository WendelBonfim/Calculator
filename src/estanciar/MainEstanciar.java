package estanciar;

public class MainEstanciar {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();

       Integer resultSoma = calcular.soma("d","2");

        System.out.println("O resultado da soma e: " + resultSoma);

        String sub = calcular.subtrair(3 ,5);

        System.out.println("A subtracao e: " + sub);

        String mult = calcular.multiplicacao(10.8,15.4);

        System.out.println("A multiplicacao e:" + mult);

        Double resultDiv = calcular.divisao("10", "2");
        System.out.println("A divisao é :" + resultDiv);
    }
}