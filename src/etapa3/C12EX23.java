package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os números multiplos de 3

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vet1 = new double[10];
        double[] vet2 = new double[10];
        for (int aux = 0; aux < vet1.length; aux++) {
            do {
                System.out.println("Indique um número inteiro.");
                vet1[aux] = teclado.nextDouble();
                if (vet1[aux] % 1 != 0) {
                    System.out.println("Número inválido. Digite novamente.");
                }
            } while (vet1[aux] % 1 != 0);
            if (vet1[aux] % 3 == 0) {
                for (int aux2 = 0; aux2 < vet1.length; aux2++) {
                    vet2[aux2] = vet1[aux];
                }
            }
            System.out.println("Multiplos de 3:");
        }
        for (int aux = 0; aux < vet1.length; aux++) {
            System.out.println(vet2[aux]);
        }
        teclado.close();
    }
}
