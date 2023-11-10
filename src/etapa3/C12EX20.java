package etapa3;

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numero = new double[10];
        double soma = 0, media = 0, cont = 0;
        for (int aux = 0; aux< numero.length; aux++){
            do {
                System.out.println("Indique um número inteiro.");
                numero[aux] = teclado.nextDouble();
            }while(numero[aux]%1!=0);
        }
        System.out.println("Números maiores que o 10o:");
        for (int aux = 0; aux< numero.length; aux++){
            if (numero[aux]>numero[9]){
                System.out.println(numero[aux]);
                soma += numero[aux];
                cont++;
            }else{
                System.out.println("Nenhum número é maior que o 10o.");
            }
        }
        System.out.println("Média: " + media);
        teclado.close();
    }
}
