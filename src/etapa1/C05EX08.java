package etapa1;
//Função: calcular o raio de um círculo a partir do valor do setor circular e do ângulo
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double Pi = 3.1416;
        double alfa, raio, setCir;
        System.out.println("Qual o valor do setor circular? ");
        setCir = teclado.nextDouble();
        System.out.println("Qual o valor do ângulo? ");
        alfa = teclado.nextDouble();

        raio = Math.sqrt(setCir * 360 / Pi/ alfa);

        System.out.println("Para o ângulo igual à " + alfa + "e setor circular igual à " + setCir + " o valor do raio é: " + raio);
    }

}
