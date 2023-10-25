package etapa3;

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        int vet[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("indique um número inteiro.");
            vet[aux] = teclado.nextInt();
        }
        System.out.print("Números divisíveis por 5 e 7: ");
        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
                System.out.println(vet[aux]);
            }
        }
        teclado.close();
    }
}


