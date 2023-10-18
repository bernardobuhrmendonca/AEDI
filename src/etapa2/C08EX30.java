package etapa2;

import java.util.Scanner;
//Nome: Bernardo Buhr Alves Mendonça
//Função: emitir o valor da série S, a partir de n e x infirmados pelo usuário
public class C08EX30 {
    public static void main(String[] args) {
        double S, x, soma=0, lnx;
        final double e = 2.71828;
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("indique o valor de x.");
        x = teclado.nextDouble();
        lnx = Math.pow(x,1/e);
        System.out.println("Indique o valor de n.");
        n = teclado.nextInt();
        for (int aux=1; aux<=n; aux++){
            soma += Math.pow(x,aux) / aux;
        }
        S = lnx + soma;
        System.out.println("S=" + S);
    }
}
