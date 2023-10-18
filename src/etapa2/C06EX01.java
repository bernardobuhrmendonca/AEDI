package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: emitir o valor de f(x)
public class C06EX01 {
    public static void main(String[] args) {
        double fx, x;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de x? ");
        x = teclado.nextDouble();
        if (x < 4) {
            fx = (5 * x + 3)/Math.sqrt(16 - Math.pow(x, 2));
            System.out.println("x é menor que 4. ");
        }
        else {
            if (x==4){
                fx = 0;
                System.out.println("x é igual a 4. ");
            }
            else{
                fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2.0) - 16);
                System.out.println("x é maior que 4. ");
            }
        }
        System.out.println("f(x)=" + fx);
        teclado.close();
    }
}