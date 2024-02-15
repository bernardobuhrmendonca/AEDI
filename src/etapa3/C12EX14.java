package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: indicar se dos bilhetes indicados pelo usuário, algum deles é o premiado

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[100];
        int numeroP;
        for (int aux = 0; aux<numeros.length; aux++){
            System.out.println("Indique o número do bilhete " + (aux + 1));
            numeros[aux] = teclado.nextInt();
        }
        System.out.println("Indique o número do bilhete premiado.");
        numeroP = teclado.nextInt();
        for (int aux = 0; aux<numeros.length; aux++){
            if (numeros[aux]==numeroP){
                System.out.println("O bilhete indicado na posição " + (aux + 1) + " foi premiado! Parabéns!");
            }else {
                System.out.println("Infelizmente nenhum dos bilhetes é o premiado, boa sorte na próxima!");
            }
        }
        teclado.close();
    }
}
