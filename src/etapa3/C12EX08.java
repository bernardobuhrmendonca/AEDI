package etapa3;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[20], soma;
        for (int aux = 0; aux< vet.length; aux++){
            do {
                System.out.println("Indique um número inteiro.");
                vet[aux] = teclado.nextDouble();
                if (vet[aux]%1>0){
                    System.out.println("Número inválido. Digite novamente");
                }
            }while(vet[aux]%1>0);
        }
        for (int aux = 0; aux < 10; aux++){
            soma = vet[aux] + vet[aux+10];
            System.out.println("Soma " + aux + 1 + "= " + soma);
        }teclado.close();
    }
}
