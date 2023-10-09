package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: inverter um número de quatro dígitos
public class C06EX14 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe um número inteiro com 4 dígitos.");
        numero = teclado.nextInt();
        if (numero<1000||numero>9999){
            System.out.println("Número inválido.");
            teclado.close();
        }
        else{
            d1 = numero / 1000;
            d2 = numero % 1000 / 100;
            d3 = numero % 100 /10;
            d4 = numero % 10;
            System.out.print(d4);
            System.out.print(d3);
            System.out.print(d2);
            System.out.print(d1);
            teclado.close();
        }
    }
}
