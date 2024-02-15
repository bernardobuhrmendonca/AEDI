package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os números maiores do que o último número indicado e a média destes

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numero = new double[10];
        double soma = 0, media, cont = 0;
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
        media = soma / cont;
        System.out.println("Média: " + media);
        teclado.close();
    }
}
