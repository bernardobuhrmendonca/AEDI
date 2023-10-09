package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os termos de uma sequência
public class C08EX20 {
    public static void main(String[] args) {
        int rep;
        double n, soma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de termos da sequência desejados.");
        rep = teclado.nextInt();
        for (int aux= 1; aux<=rep; aux++){
           n = Math.pow(2,(aux-1));
            System.out.println(n);
            soma+=n;
        }
        System.out.println(soma);
        teclado.close();
    }
}
