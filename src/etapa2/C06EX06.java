package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular as raizes de uma função
public class C06EX06 {
    public static void main(String[] args) {
        double a, b, c, delta, r1, r2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de a? ");
        a = teclado.nextDouble();
        System.out.println("Qual o valor de b? ");
        b = teclado.nextDouble();
        System.out.println("Qual o valor de c? ");
        c = teclado.nextDouble();
        delta = Math.pow(b,2.0) - 4 * a * c;
        if (delta>0){
            r1 = b * (-1) + Math.sqrt(delta) / 2 * a;
            r2 = b * (-1) - Math.sqrt(delta) / 2 * a;
            System.out.println("O valor das raizes serão:" +
                    "\nr1=" + r1 +
                    "\nr2=" + r2);
        }else{
            if(delta==0){
                r1 = b * (-1) / 2 * a;
                System.out.println("O valor da raiz é: r=" + r1);
            }else{
                System.out.println("A função indicada não possui raizes.");
            }
        }
        teclado.close();
    }
}
