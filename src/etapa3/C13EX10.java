package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir um nome mas com apenas uma letra por linha e método main

import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        ex10();
    }
    public static void ex10(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Indique um nome.");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String[] letra = nome.split("");
        for (int aux=0; aux< letra.length; aux++){
            System.out.println(letra[aux]);
        }
    }
}
