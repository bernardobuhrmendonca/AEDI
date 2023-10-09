package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: custo de armazenamento de bolas paraa copa
public class C06EX12 {
    public static void main(String[] args) {
        int bolas,bolasD, caixas, meses, galpao;
        double custoC, custoG, cT, gT, totalGas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas bolas foram produzidas? ");
        bolas = teclado.nextInt();
        System.out.println("Quantas destas bolas estavam com defeito? ");
        bolasD = teclado.nextInt();
        System.out.println("Qual o custo de cada caixa de papelão? ");
        custoC = teclado.nextDouble();
        System.out.println("Quantos meses faltam para a Copa? ");
        meses = teclado.nextInt();
        System.out.println("Qual o custo mensal do aluguel de um galpão? ");
        custoG = teclado.nextDouble();
        caixas = (bolas - bolasD) / 10;
        if ((bolas-bolasD)%10!=0){
            caixas = ((bolas - bolasD) / 10) + 1;
        }
        galpao = caixas / 850;
        if (caixas%850!=0){
            galpao = caixas / 850 + 1;
        }
        cT = custoC * caixas;
        gT = custoG * galpao * meses;
        totalGas = cT + gT;
        System.out.printf("O gasto total para armazenamento das bolas até a copa será: R$%1.2f",totalGas);
        teclado.close();
    }
}
