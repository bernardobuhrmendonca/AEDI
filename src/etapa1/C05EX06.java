package etapa1;
//Função: calcular a distância entre ponto P(x,y) e a reta com os elementos A, B, e C
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, C, x, y, d;
        System.out.println("Qual o valor de x? ");
        x = teclado.nextDouble();
        System.out.println("Qual o valor de y? ");
        y = teclado.nextDouble();
        System.out.println("Qual o valor de A? ");
        A = teclado.nextDouble();
        System.out.println("Qual o valor de B? ");
        B = teclado.nextDouble();
        System.out.println("qual o valor de C? ");
        C = teclado.nextDouble();

        d = (A*x + B*y + C) / Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        System.out.println("O valor da distância é: " + d);

    }
}
