package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os termos de uma sequência
public class C08EX20 {
    public static void main(String[] args) {
        int rep;
        double n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de termos da sequência desejados.");
        rep = teclado.nextInt();
        for (int aux= 0; aux<=rep; aux++){
           n = Math.pow(2,aux);
            System.out.println(n);
        }
        teclado.close();
    }
}
