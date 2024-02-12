package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: formatar o nome indicado para a norma ABNT e imprimi-lo, e o método main

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        ex8();
    }

    public static void ex8() {
        String nome;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o seu nome completo.");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String[] parte = nome.split(" ");
        System.out.print(parte[parte.length - 1] + ", ");
        for (int aux = 0; aux < parte.length - 1; aux++) {
            String[] letra = parte[aux].split("");
            System.out.print(letra[0] + ". ");
        }
        teclado.close();
    }
}
