package etapa1;
//Função: determinar o valor da área e do volume de um círculo
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        double raio, area, volume;
        final double Pi = 3.1416;

        System.out.println("Qual o valor do raio?");
        raio = teclado.nextDouble();

        area = Math.pow(raio,2) * 4.0 * Pi;

        volume = Math.pow(raio,3) * 4.0 * Pi / 3;

        System.out.println("O valor da área do círculo é: " + area +
                "\nO valor do volume é: " + volume);

    }
}
