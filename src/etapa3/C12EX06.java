package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os meses do ano, que serão indicados pelo usuário

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] meses = new String[12];
        for (int aux = 0; aux< meses.length; aux++){
            System.out.println("Indique o mês " + (aux + 1) + " do ano");
            teclado.nextLine();
        }
        for (int aux = 11; aux>=0; aux--){
            System.out.println(meses[aux]);
        }
        teclado.close();
    }
}
