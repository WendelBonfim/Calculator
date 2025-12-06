package intefaces;

public class CalcularImplement implements ICalcular{

    @Override
    public Integer soma(String numUm, String numDois) {
        Integer numUmSoma = Integer.parseInt(numUm);
        Integer numDoisSoma = Integer.parseInt(numDois);
        Integer resultado = numUmSoma + numDoisSoma;

        return resultado;
    }

    @Override
    public String subtrair(Integer SubUm, Integer SubDois) {
        Integer resultadoSub = SubUm - SubDois;
        String resultadoSubToString = String.valueOf(resultadoSub);
        return resultadoSubToString;
    }

    @Override
    public String multiplicacao(Double multUm, Double multDois) {
        Double resultadoMult = multUm * multDois;
        String resultadoMultString = String.valueOf(resultadoMult);
        return resultadoMultString;
    }

    @Override
    public Double divisao(String divUm, String divDois) {
        Double numUmDiv = Double.parseDouble(divUm);
        Double numDoisDiv = Double.parseDouble(divDois);
        Double resultadoDiv = numUmDiv / numDoisDiv;
        return resultadoDiv;
    }
}
