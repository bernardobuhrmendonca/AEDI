package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular custo de um projeto
public class C08EX10 {
    public static void main(String[] args) {
        String nome, nomePM="";
        int quant=0, insulmo;
        double custoT=0, custoP,precoU, custoPM=0, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos insulmos serão ultilizados no projeto? ");
        insulmo = teclado.nextInt();
        for (int aux=1; aux<=insulmo; aux++) {
            teclado.nextLine();
            System.out.println("Indique o nome do insulmo. ");
            nome = teclado.nextLine();
            System.out.println("Indique o custo unitario do insulmo. ");
            precoU = teclado.nextDouble();
            System.out.println("Indique a quantidade deste insulmo que será usada. ");
            quant = teclado.nextInt();
            custoP = quant * precoU;
            custoT += custoP;
            if (aux==1||custoP>custoPM){
                custoPM = custoP;
                 nomePM = nome;
            }
        }
        media = custoT / quant;
        System.out.printf("a)Custo total= R$%1.2f \nb)Média dos Custos Parciais= R$%1.2f \nc)Insulmo Parcial de Maior Custo: ",custoT,media);
        System.out.println(nomePM);
        teclado.close();
    }
}
