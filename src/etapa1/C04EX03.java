package etapa1;
//Funçao: montar tabela que indique os valores de multa por poluição
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C04EX03 {
    public static void main(String[] args) {
        double vMenor, vMaior, mMenor, mInter, mMaior;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Qual o valor máximo de emissão para a menor multa? ");
        vMenor = teclado.nextDouble();
        System.out.println("Qual o valor mínimo da multa? ");
        mMenor = teclado.nextDouble();
        System.out.println("qual o valor máximo de emissão para a multa intermediária? ");
        vMaior = teclado.nextDouble();
        System.out.println("qual o valor da multa intermediária? ");
        mInter = teclado.nextDouble();
        System.out.println("qual o valor por poluente emitido na multa de maior valor?");
        mMaior = teclado.nextDouble();

        System.out.println();

        System.out.println("============================================================================");
        System.out.println("              Quantidade de Poluente Emitido X Valor da Multa               ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf ("Até " + vMenor + " multa de R$%1.2f",mMenor                                  );
        System.out.println(                                                                              );
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf ("Acima de " + vMenor + " até " + vMaior + " multa de R$%1.2f",mInter          );
        System.out.println(                                                                              );
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf ("Acima de  " + vMaior + " multa de R$%1.2f",mMaior + " por poluente emitido"  );
        System.out.println(                                                                              );
        System.out.println("============================================================================");






















    }
}
