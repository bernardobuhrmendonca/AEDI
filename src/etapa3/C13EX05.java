package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: função para calcuklar os dados matemáticos de determinado ângulo inidicado pelo usuário e método main

import java.util.Scanner;

public class C13EX05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo;
        System.out.println("Indique o ângulo.");
        angulo = teclado.nextDouble();
        ex5(angulo);
        teclado.close();
    }
    public static void ex5(double angulo){
        double rad;
        rad = Math.toRadians(angulo);
        System.out.println("Ângulo: " + angulo);
        System.out.println("Radiando: " + rad);
        System.out.println("Seno: " + Math.sin(rad));
        System.out.println("Cosseno: " + Math.cos(rad));
        System.out.println("Tangente: " + Math.tan(rad));
        System.out.println("Arco seno: " + (1/Math.sin(rad)));
        System.out.println("Arco cosseno: " + (1/Math.cos(rad)));
        System.out.println("Arco tangente: " + (1/Math.tan(rad)));
    }
}
