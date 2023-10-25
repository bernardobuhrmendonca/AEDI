package etapa1;
//Função: calcular o valor de x elevado ao quadrado mais 4x mais 10
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX01 {
    public static void main(String[] args) {

        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de x?");
        x = teclado.nextDouble();

        fx = Math.pow(x,3) + 4 * x + 10;

        System.out.println("O valor de f(x) é: " + fx);
    }
}
