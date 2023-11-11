package etapa3;

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Indique uma frase.");
        frase = teclado.nextLine();
        String[] palavra = frase.split(" ");
        for (int aux=0; aux< palavra.length; aux++){
            System.out.println(palavra[aux]);
        }
        teclado.close();
    }
}
