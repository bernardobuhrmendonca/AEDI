package etapa3;

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String temp;
        String[] mes = new String[12];
        int cont=mes.length-1;
        for (int aux = 0; aux<mes.length; aux++){
            System.out.println("Indique o mês " + (aux + 1) + " do ano.");
            mes[aux] = teclado.nextLine();
        }
            for (int aux2 = 0; aux2 < mes.length - 1; aux2++) {
                for (int x = 0; x < cont; x++) {
                    if (mes[x].compareToIgnoreCase(mes[x + 1]) > 0) {
                        temp = mes[x];
                        mes[x] = mes[x + 1];
                        mes[x + 1] = temp;
                    }
                }
                cont--;
            }
        for (int aux = 0; aux<mes.length; aux++){
            System.out.println(mes[aux]);
        }
    }
}
