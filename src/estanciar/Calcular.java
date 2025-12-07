package estanciar;

public class Calcular {

    public Integer soma(String somaNumUm, String somaNumDois){
      boolean resultValid= validarNumerosSemLetra(somaNumUm,somaNumDois);
        if (resultValid == true ){
            Integer somaUmInt = Integer.parseInt(somaNumUm);
            Integer somaDoisInt = Integer.parseInt(somaNumDois);
            Integer result = somaUmInt + somaDoisInt;
            return result;
        }

        return 0;
    }

    public String subtrair(Integer subNumeroUm, Integer subNumeroDois){
        Integer resultSub = subNumeroUm - subNumeroDois;
        String resultString = Integer.toString(resultSub);
        return  resultString;
    }

    public String multiplicacao(Double multUm, Double multDois){
        Double resultDoub = multUm * multDois;
        String resultStringMult = Double.toString(resultDoub);
        return  resultStringMult;
    }
    public Double divisao (String divUm, String divDois){
        Double divUmDouble = Double.parseDouble(divUm);
        Double divDoisDouble = Double.parseDouble(divDois);
        Double resultDiv = divUmDouble / divDoisDouble;
        return resultDiv;
    }

    public boolean validarNumerosSemLetra(String somaNumUm, String somaNumDois){
        boolean resultValid = somaNumUm.matches("\\d+") && somaNumDois.matches("\\d+");
        if(resultValid == false){
            throw new NumberFormatException("Não e um formato valido.");
        }
        return true;
    }
}
