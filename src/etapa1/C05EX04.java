package etapa1;
//Função: calcular a distância de dois pontos no plano cartesiano
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, x2, y1, y2, d;
        System.out.println("Qual o valor de x1? ");
        x1 = teclado.nextDouble();
        System.out.println("Qual o valor de x2? ");
        x2 = teclado.nextDouble();
        System.out.println("Qual o valor de y1? ");
        y1 = teclado.nextDouble();
        System.out.println("Qual o valor de y2? ");
        y2 = teclado.nextDouble();

        d = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println();

        System.out.println("A distância entre os pontos é: " + d);
    }

}
