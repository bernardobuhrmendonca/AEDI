package etapa3;

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[20];
        for(int aux = 0; aux< numero.length; aux++){
            System.out.println("Indique um número inteiro.");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 1; aux< numero.length; aux+=2){
            System.out.println(numero[aux]);
        }
        for (int aux = 0; aux< numero.length; aux+=2) {
            System.out.println(numero[aux]);
        }
    }
}
