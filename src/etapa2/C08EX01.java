package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular a área de um círculo
public class C08EX01 {
    public static void main(String[] args) {
        double area, raio;
        final double pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        for (int aux=1; aux<=10; aux++){
            System.out.println("Qual o raio do círculo?");
            raio = teclado.nextDouble();
            area = pi * Math.pow(raio,2.0);
            System.out.println("A área é: " + area);
        }
        teclado.close();
    }
}
