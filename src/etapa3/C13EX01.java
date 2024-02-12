package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o resultado da fórmula que determina a distância de dois pontos do plano cartesiano

import java.util.Scanner;

public class C13EX01 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o valor de x1.");
        x1 = teclado.nextDouble();
        System.out.println("Indique o valor de x2.");
        x2 = teclado.nextDouble();
        System.out.println("Indique o valor de y1.");
        y1 = teclado.nextDouble();
        System.out.println("Indique o valor de y2.");
        y2 = teclado.nextDouble();
        resultado = ex1(x1,x2,y1,y2);
        System.out.println("A distância é igual à: " + resultado);
    }
    static double ex1 (double x1, double x2, double y1, double y2) {
        double resultado;
        resultado = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        return resultado;
    }
}
