package intefaces;

public class MainInterface {
    public static void main(String[] args) {
        CalcularImplement calcularImplement = new CalcularImplement();

        Integer calcSoma = calcularImplement.soma("9","11");
        System.out.println("A soma e:" + calcSoma);

        String subResult = calcularImplement.subtrair(10,9);
        System.out.println("A subtração e: " + subResult);

        String multResult = calcularImplement.multiplicacao(15.0,14.5);
        System.out.println("A multiplicacao e :" + multResult);

        Double divResult = calcularImplement.divisao("100","10");
        System.out.println("A divisao e :" + divResult);

    }
}
