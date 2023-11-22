package etapa3;

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex7(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        String[] nomeC = new String[100];
        String[] nomesV = new String[100];
        System.out.println("Indique um nome completo.");
        nome = teclado.nextLine();
        String[] palavras = nome.split(" ");
        for (int aux=0; aux<nomeC.length; aux++) {
            System.out.println("Indique um nome.");
            nomeC[aux] = teclado.nextLine();
            String[] quant = nomeC[aux].split(" ");
            if (quant[quant.length].equalsIgnoreCase(palavras[palavras.length])){
                for (int aux2=0; aux2<nomeC.length; aux++){
                    nomesV[aux2] = nomeC[aux];
                }
            }
        }
        System.out.println("Pertencente à família " + palavras[palavras.length]);
        for (int aux=0; aux<nomesV.length; aux++){
            System.out.println(nomesV[aux]);
        }
        teclado.close();
    }
}
