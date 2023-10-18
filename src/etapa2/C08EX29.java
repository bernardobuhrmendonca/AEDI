package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar a potenciação de um número, onde o valor do número e do expoente serâo determinados pelo usuário
public class C08EX29 {
    public static void main(String[] args) {
        int rep, x;
        double potencia = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o número que será potênciado.");
        x = teclado.nextInt();
        System.out.println("Indique o número que será o expoente.");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            potencia *= x;
        }
        System.out.println("x^" + rep + "=" + potencia);
    }
}

