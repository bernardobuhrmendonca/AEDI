package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o rendimento, o imposto de renda e o valor resgatado em uma aplicação
public class C06EX10 {
    public static void main(String[] args) {
        int dias;
        double taxaD, capA, valorR, impRen, rendimento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o capital aplicado. ");
        capA = teclado.nextDouble();
        System.out.println("Informe a taxa diaria de rendimento muméricamente. ");
        taxaD = teclado.nextDouble();
        System.out.println("Informe o número de dias que o capital permaneceu aplicado. ");
        dias = teclado.nextInt();
        rendimento = capA * taxaD / 100.0 * dias;
        impRen = 15 / 100.0 * rendimento;
        valorR = capA + rendimento - impRen - 10.0;
        System.out.printf("Valor aplicado: R$%1.2f", capA);
        System.out.println();
        System.out.printf("Rendimento: R$%1.2f",rendimento);
        System.out.println();
        System.out.printf("Imposto de renda: R$%1.2f",impRen);
        System.out.println();
        System.out.printf("Valor resgatado: R$%1.2f",valorR);
        teclado.close();
    }
}
