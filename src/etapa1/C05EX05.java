package etapa1;
//Função: converter temperaturas de Celcius para Kelvin e Fahrenheit
//Autor:
import java.util.Scanner;
public class C05EX05 {
    public static void main(String[] args) {
        double Kt, Ct, Ft;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor da temperatura em graus Celsius? ");
        Ct = teclado.nextDouble();

        Ft = (9.0 * Ct + 160) / 5.0;
        Kt = Ct + 273.0;

        System.out.println("A temperatura de: " + Ct + " graus Celcius equivale à:\n" +
                Ft + " graus Fahrenheit\n" +
                Kt + " graus Kelvin");
    }
}
