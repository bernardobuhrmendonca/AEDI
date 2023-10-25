package etapa1;
//Função: calcular o custo de embalagens e transporte para venda de plantas
//Nome: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX15 {
    public static void main(String[] args) {
        double mudas, mudasP, mudasV, caixaP, caixaM, caminhao, cCaixaP, cCaixaM, cFrete, custoT, caixaPtot, caixaMtot, freteTot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas mudas foram produzidas? ");
        mudas = teclado.nextDouble();
        System.out.println("Quantas mudas foram perdidas? ");
        mudasP = teclado.nextDouble();
        System.out.println("Qual o custo de uma caixa de papelão? ");
        cCaixaP = teclado.nextDouble();
        System.out.println("Qual o custo de uma caixa de madeira? ");
        cCaixaM = teclado.nextDouble();
        System.out.println("Qual o preço do frete de cada caminhão? ");
        cFrete = teclado.nextDouble();

        mudasV = mudas - mudasP;
        caixaP = mudasV / 7;
        caixaPtot = caixaP * cCaixaP;
        caixaM = caixaP / 15 + Math.pow((caixaP%15),0);
        caixaMtot = caixaM * cCaixaM;
        caminhao = caixaM / 50 + Math.pow((caixaM%50),0);
        freteTot = caminhao * cFrete;
        custoT = freteTot + caixaMtot + caixaPtot;

        System.out.printf("O custo total das embalagens e do transporte será: R$%1.2f", custoT);


    }
}
