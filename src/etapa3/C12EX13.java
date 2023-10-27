package etapa3;

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        String nomeP;
        for (int aux = 0; aux<nome.length; aux++) {
            System.out.println("Indique o nome d a pessoa na posição " + aux + 1);
            nome[aux] = teclado.nextLine();
        }
        System.out.println("Indiqueee um nome a ser pesquisado.");
        nomeP = teclado.nextLine();
        for (int aux = 0; aux<nome.length; aux++){
            if (nomeP.equalsIgnoreCase(nome[aux])){
                System.out.println("A pessoa pesquisada esta em " + aux + 1 + "o da fila.");
            }else{
                System.out.println("Esta pessoa não se encontra na fila.");
            }
            teclado.close();
        }
    }
}
