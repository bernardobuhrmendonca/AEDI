package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: preecher uma lista com as pessoas em uma fila e indicar um sistema de pesquisa para indicar a possição do nome indicado, na fila

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        String nomeP;
        for (int aux = 0; aux<nome.length; aux++) {
            System.out.println("Indique o nome da pessoa na posição " + aux + 1);
            nome[aux] = teclado.nextLine();
        }
        System.out.println("Indique um nome a ser pesquisado.");
        nomeP = teclado.nextLine();
        for (int aux = 0; aux<nome.length; aux++){
            if (nomeP.equalsIgnoreCase(nome[aux])){
                System.out.println("A pessoa pesquisada esta em " + aux + 1 + "o da fila.");
                break;
            }else if(aux==nome.length-1){
                System.out.println("Esta pessoa não se encontra na fila.");
            }
        }
        teclado.close();
    }
}
