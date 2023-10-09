package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular se um número é multiplo de 5 e 7
public class C06EX05 {
    public static void main(String[] args) {
        long x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro");
        x = teclado.nextLong();
        if (x%5%7==0){
            System.out.println("O número é divisível por 5 e 7");
        }else{
            System.out.println("O número não é divisível por 5 e 7");
        }
        teclado.close();
    }
}
