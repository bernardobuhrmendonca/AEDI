package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir valores de total serviços prestados por uma empresa e a média destes
public class C10EX02 {
    public static void main(String[] args) {
        double servP, media=0, total=0, cont1=0, cont2=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Qual o valor do serviço prestado? ");
            servP = teclado.nextDouble();
            cont1++;
            total += servP;
            if (servP>1000){
                cont2++;
            }
        }while(servP!=0);
        media = total / cont1;
        System.out.printf("Total= R$%1.2f\nMédia= R$%1.2f\nSErviços acima de R$1000,00= ", total, media);
        System.out.println(cont2);
    }
}
