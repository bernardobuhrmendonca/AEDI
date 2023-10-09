package etapa2;

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        double idade, cont, contH=0, contM=0, rep;
        String nome, sexo="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a quantidade de repetições.");
        rep = teclado.nextDouble();
        for (int aux = 1; aux<=rep; aux++){
            System.out.println("Indique o seu sexo por M ou F.");
            if (sexo.equalsIgnoreCase("M")){
                contH++;

            }else{
                if (sexo.equalsIgnoreCase("F"))
            }
        }
    }
}
