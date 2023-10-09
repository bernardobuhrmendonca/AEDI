package etapa2;

//Autor: Bernardo Buhr Alves Mwndonça
//Função: calcular os valores de uma função para valores inteiros de 3 à 12
public class C08EX17 {
    public static void main(String[] args) {
        double soma, f;
        for (int aux=3; aux<=12; aux++){
            f = Math.sqrt(Math.pow(aux,2.0) - 3);
            System.out.printf("x=" + aux + "  f(x)=%1.4f\n",f);
        }
    }
}
