package etapa3;

import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]pop = new int[100];
        int cont = pop.length-1, temp;
        String tempS;
        String[]nome = new String[100];
        String[]estado = new String[100];
        for (int aux=0; aux< pop.length; aux++) {
            System.out.println("Indique o nome da cidade.");
            nome[aux] = teclado.nextLine();
            System.out.println("Indique o estado da cidade.");
            estado[aux] = teclado.nextLine();
            System.out.println("Indique a população da cidade.");
            pop[aux] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int aux=0; aux< pop.length-1; aux++){
            for (int x=0; x<cont; x++){
                if (pop[aux]<pop[aux+1]){
                    temp = pop[aux];
                    pop[aux] = pop[aux+1];
                    pop[aux+1] = temp;
                    tempS = estado[aux];
                    estado[aux] = estado[aux+1];
                    estado[aux+1] = tempS;
                }
            }
            cont--;
        }
        System.out.println("10 cidades mais populosas:");
        for (int aux=0; aux<10; aux++){
            System.out.println((aux+1) + ") " + nome[aux] + ", " + estado[aux]);
        }
    }
}
