package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o vetor indicado pelo usuário na ordem inversa

import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]num = new int[10];
        int[]inv = new int[10];
        for (int aux=0; aux < num.length; aux++){
            System.out.println("Indique um número ");
            num[aux] = teclado.nextInt();
        }
        for (int aux=0; aux < num.length; aux++){
            inv[num.length-1-aux] = num[aux];
        }
        for (int aux=0; aux< inv.length; aux++){
            System.out.println(inv[aux]);
        }
        teclado.close();
    }
}
