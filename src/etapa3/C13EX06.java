package etapa3;

import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        ex6();
    }
    public static void ex6(){
        Scanner teclado = new Scanner(System.in);
        String sobrenome;
        String[] nomeC = new String[100];
        String[] nomesV = new String[100];
        System.out.println("Indique um sobrenome.");
        sobrenome = teclado.nextLine();
        for (int aux=0; aux<nomeC.length; aux++) {
            System.out.println("Indique um nome.");
            nomeC[aux] = teclado.nextLine();
            String[] quant = nomeC[aux].split(" ");
            if (quant[quant.length].equalsIgnoreCase("Silva")){
                for (int aux2=0; aux2<nomeC.length; aux++){
                    nomesV[aux2] = nomeC[aux];
                }
            }
        }
        System.out.println("Pertencente à família:");
        for (int aux=0; aux<nomesV.length; aux++){
            System.out.println(nomesV[aux]);
        }
        teclado.close();
    }
}
