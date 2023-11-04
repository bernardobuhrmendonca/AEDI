package etapa3;

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] vet = new String[12];
        for (int aux = 0; aux< vet.length; aux++){
            System.out.println("Indique o mês " + (aux + 1) + " do ano");
            teclado.nextLine();
        }
        for (int aux = 11; aux>=0; aux--){
            System.out.println(vet[aux]);
        }
        teclado.close();
    }
}
