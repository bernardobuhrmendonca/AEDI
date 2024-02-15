package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir a multiplicação de dois números inteiros indicados pelo usuário

import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        int num2;
        for (int aux=0; aux< num.length; aux++) {
            System.out.println("Indique um número inteiro");
            num[aux] = teclado.nextInt();
        }
        System.out.println("indique um multiplicador ");
        num2 = teclado.nextInt();
        for(int aux=0; aux< num.length; aux++){
            System.out.println(num[aux] + " x " + num2 + " = " + (num[aux]*num2));
        }
        teclado.close();
    }
}
