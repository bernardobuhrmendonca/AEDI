package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: retornar o valor de f(x) de acordo com o valor de x

public class C13EX02A {
    public static double ex2 (double x) {
        double resultado;
        if (x==4){
            resultado = 0;
        } else if (x<4) {
            resultado = (5 * x + 3) / Math.sqrt(16 - Math.pow(x,2));
        } else {
            resultado = (5 * x + 3) / Math.sqrt(Math.pow(x,2) - 16);
        }
        return resultado;
    }
}
