package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir valores de multa e a média destes
public class C10EX01 {
    public static void main(String[] args) {
        double valor, media=0, multa, cont=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Indique o valor. ");
            valor = teclado.nextDouble();
            if(valor==-1) {
                System.out.println("as repetições serão interrompidas.");
                break;
            }
            cont++;
            multa = valor * 10 / 100;
            media += multa / cont;
            System.out.printf("Valor= R$%1.2f.\nMulta= R$%1.2f.", valor, multa);
            System.out.println();
        }while(valor!=-1);
        System.out.printf("A média das multas é: R$%1.2f", media);
        System.out.println();
        teclado.close();
    }
}
