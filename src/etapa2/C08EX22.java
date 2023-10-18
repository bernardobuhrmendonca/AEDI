package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar se um número é ou não primo
public class C08EX22 {
    public static void main(String[] args) {
        int numero, divisores=0;
        double  divisao;
        Scanner teclado = new Scanner(System.in);
        do {
        System.out.println("Indique um número inteiro diferente de zero.");
        numero = teclado.nextInt();
        if (numero<0){
            System.out.println("Número inválido. Digite novamente");
        }
        }while(numero<0);
        for (int aux = 1; aux<=numero; aux++){
            if (numero%aux==0){
                divisores++;
            }
        }
        if(divisores<=2){
            System.out.println("O número é primo.");
        }else{
            System.out.println("O número não é primo.");
        }
        teclado.close();
    }
}
