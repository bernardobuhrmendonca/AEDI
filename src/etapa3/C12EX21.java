package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os números na sequência informados, mas os números de posição ímpar serão indicados antes de qualuqer um de psição par
//Obs: o número na posição 0 do vetor é o 1o a ser indicado, então ele representa o início da sequência das posições ímpares

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[20];
        for(int aux = 0; aux< numero.length; aux++){
            System.out.println("Indique um número inteiro.");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux< numero.length; aux+=2){
            System.out.println(numero[aux]);
        }
        for (int aux = 1; aux< numero.length; aux+=2) {
            System.out.println(numero[aux]);
        }
        teclado.close();
    }
}
