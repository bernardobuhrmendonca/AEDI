package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar se um número é ou não palíndromo
public class C08EX23 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Indique um número inteiro de quatro dígitos.");
            numero = teclado.nextInt();
            if (numero<1000||numero>9999){
                System.out.println("Número inválido. Digite novamente");
            }
        }while(numero<1000||numero>9999);
        if (numero%10==numero/1000&&numero%100/10==numero%1000/100){
            System.out.println("O número é palíndromo.");
        }else{
            System.out.println("O número não é palíndromo.");
        }
        teclado.close();
    }
}
