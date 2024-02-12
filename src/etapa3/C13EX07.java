package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o último sobrenome da pessoa indicada e método main

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex7(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Indique um nome completo.");
        nome = teclado.nextLine();
        String[] palavras = nome.split(" ");
        System.out.println(palavras[palavras.length-1]);
        teclado.close();
    }
}
