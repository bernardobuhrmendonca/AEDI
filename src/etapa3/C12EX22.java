package etapa3;

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        String pesq;
        String[] placa = new String[100];
        String[] dono = new String[100];
        Scanner teclado = new Scanner(System.in);
        for (int aux=0; aux<placa.length; aux++){
            System.out.println("Indique a placa do carro da vaga " + (aux+1));
            placa[aux] = teclado.nextLine();
            System.out.println("Indique o nome do dono do carro da vaga " + (aux+1));
            dono[aux] = teclado.nextLine();
        }
        System.out.println("Indique a placa do carro ou o nome do dono deste para saber a vaga correspondente.");
        pesq = teclado.nextLine();
        for (int aux=0; aux<placa.length; aux++){
            if (pesq.equalsIgnoreCase(placa[aux])||pesq.equalsIgnoreCase(dono[aux])){
                System.out.println("A vaga do morador é a número: " + (aux+1));
            } else if (aux==placa.length-1) {
                System.out.println("Morador não identificado.");
            }
        }
        teclado.close();
    }
}
