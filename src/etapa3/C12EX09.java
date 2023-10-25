package etapa3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[10], soma = 0;
        for (int aux = 0; aux < vet.length; aux++) {
            do {
                System.out.println("Indique um número inteiro.");
                vet[aux] = teclado.nextDouble();
                if (vet[aux] % 1 > 0) {
                    System.out.println("Número inválido. Digite novamente");
                }
            } while (vet[aux] % 1 > 0);
            soma += vet[aux];
        }
        System.out.println("Números divisores da soma dos valores informados:");
        for (int aux = 0; aux < vet.length; aux++) {
            if (soma % vet[aux] == 0) {
                System.out.println(vet[aux]);
            }
        }
        teclado.close();
    }
}
