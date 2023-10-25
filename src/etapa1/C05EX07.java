package etapa1;
//Função: calcularo resultado da função f(x) = raiz de ((x/4 + 1) ao quadrado + 1/5x)
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX07 {
    public static void main(String[] args) {
        double fx, x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de x? ");
        x = teclado.nextDouble();
        fx = Math.sqrt(Math.pow((x/4+1),2) + x/5 );
        System.out.println("O valor de f(x) para x=" + x + " é: " + fx);
    }

}
