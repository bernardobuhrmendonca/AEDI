package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: duas formas de imprimir a frase indicada com a primeira letra de cada palavra maiúscula e o método main

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        ex9a();
        ex9b();
    }
    public static void ex9a(){
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique uma frase.");
        frase = teclado.nextLine();
        String[] palavras = frase.split(" ");
        for (int aux = 0; aux < palavras.length; aux++){
            palavras[aux] = palavras[aux].toLowerCase();
            String[] letra = palavras[aux].split("");
            letra[0] = letra[0].toUpperCase();
            for(int aux2 = 0; aux2< letra.length; aux2++){
                System.out.print(letra[aux2]);
            }
            System.out.print(" ");
        }
        teclado.close();
    }
    public static void ex9b(){
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique uma frase.");
        frase = teclado.nextLine();
        frase = frase.toLowerCase();
        String[] letra = frase.split("");
        letra[0] = letra[0].toUpperCase();
        for (int aux = 0; aux< letra.length; aux++){
            if (letra[aux].equalsIgnoreCase(" ")){
                letra[aux+1] = letra[aux+1].toUpperCase();
            }
            System.out.print(letra[aux]);
        }
        teclado.close();
    }
}

