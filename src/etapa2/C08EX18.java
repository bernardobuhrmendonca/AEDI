package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimie os multiplos de um inteiro de 1 à 9
public class C08EX18 {
    public static void main(String[] args) {
        int n, mult;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro de 1 à 9.");
        n = teclado.nextInt();
        if (n/10!=0||n>9){
            System.out.println("Número inválido.");
            teclado.close();
        }
        for (int aux=1; aux<=1000; aux++){
            mult = n * aux;
            System.out.println(aux + "x" + n + "=" + mult);
        }
        teclado.close();
    }
}
