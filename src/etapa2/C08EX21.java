package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir uma tabela de IMC de acordo com a autura indicada
public class C08EX21 {
    public static void main(String[] args) {
        double imc, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua altura em metros?");
        altura = teclado.nextDouble();
        System.out.println("PESO\tIMC\t\t\tSITUAÇÃO CORPÓREA");
        for (int aux = 60; aux <= 100; aux++){
            imc =aux / Math.pow(altura,2);
            if (imc<20){
            System.out.printf("%d\t\t%1.1f\t\tabaixo do peso.", aux, imc);
            }else{
                if (imc<25){
                    System.out.printf("%d\t\t%1.1f\t\tpeso ideal.", aux, imc);
                }else{
                    System.out.printf("%d\t\t%1.1f\t\tacima do peso.", aux, imc);
                }
            }
            System.out.println();
        }
    }
}
