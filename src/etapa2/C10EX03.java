package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir valores dos setores circulares para determinado ângulo
public class C10EX03 {
    public static void main(String[] args) {
        double angulo, raio=0, setor;
        final double pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o angulo desejado.");
        angulo = teclado.nextDouble();
        do {
            System.out.println("Indique um valor para o raio.");
            raio = teclado.nextDouble();
            if (raio==-1){
                System.out.println("O sistema será encerrado.");
                break;
            }
            setor =angulo * pi * Math.pow(raio,2.0) / 360.0;
            System.out.println("O valor do setor circular é igual a " + setor);
        }while(raio!=-1);
        teclado.close();
    }
}
