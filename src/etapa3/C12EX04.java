package etapa3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[20];
        int cont=0, cont2=1;
        for (int aux = 0; aux< vet.length; aux++){
            cont++;
            System.out.println("Indique o número do corredor que chegou na posição " + cont);
            vet[aux] = teclado.nextInt();
        }
        System.out.println("Ordem de largada das duplas na segunda bateria:");
        for (int aux = 0; aux< vet.length; aux++){
            System.out.println(cont2 + aux + "a) " + vet[aux]+ ", " + vet[aux+10]);
        }
        teclado.close();
    }
}
