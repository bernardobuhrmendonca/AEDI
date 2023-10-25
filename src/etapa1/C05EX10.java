package etapa1;
import java.util.Scanner;

public class C05EX10 {
    public static void main(String[] args) {
        long X0, X1, X2, X3, X4, X5;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número de 5 digitos. ");
        X0 = teclado.nextLong();

        X1 = X0 / 10000;
        X2 = X0 / 1000 % 10;
        X3 = X0 % 1000 / 100;
        X4 = X0 % 100 / 10;
        X5 = X0 % 10;

        System.out.println("Impressão=\n" +
                X1 + "\n" +
                X2 + "\n" +
                X3 + "\n" +
                X4 + "\n" +
                X5 + "\n");
    }
}

