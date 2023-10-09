package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o custo de uma de venda de materiais manufaturados
public class C10EX04 {
    public static void main(String[] args) {
        String material;
        double precoF=0, BDI, custoP, quantM, precoU;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a taxa BDI da empresa.");
        BDI = teclado.nextDouble();
        teclado.nextLine();
        do{
            System.out.println("Indique o nome do material.");
            material = teclado.nextLine();
            if (material.equalsIgnoreCase("FIM")){
                System.out.println("O sistema será encerrado.");
                break;
            }
            System.out.println("Indique o valor da unidade do material.");
            precoU = teclado.nextDouble();
            System.out.println("Indique a quantidade utilizada do material.");
            quantM = teclado.nextDouble();
            custoP = quantM * precoU;
            System.out.printf("O preço parcial deste material é igual a: R$%1.2f.", custoP);
            precoF += custoP + custoP * BDI / 100.0;
            System.out.println();
            teclado.nextLine();
        }while(!material.equalsIgnoreCase("FIM"));
        System.out.printf("O preço final é igual a: R$%1.2f.",precoF);
        teclado.close();
    }
}
