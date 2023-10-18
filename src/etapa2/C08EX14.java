package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: emitir uma matriz com quantidade de caractéres e tipo de caractéres determinados pelo usuário
public class C08EX14 {
    public static void main(String[] args) {
        String simbolo;
        int caracter;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um símbolo para ser imprimido na matriz.");
        simbolo = teclado.nextLine();
        do {
            System.out.println("Indique um número entre 1 e 20 para ser a quantidade de linhas da matriz");
            caracter = teclado.nextInt();
            if (caracter<1||caracter>20){
                System.out.println("Número inválido. Digite novamente.");
            }
        }while(caracter<1||caracter>20);
        for (int aux=1; aux<=caracter; aux++){
            for (int aux2=1;aux2<=caracter; aux2++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}
