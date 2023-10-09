package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar se um número é impar ou par, a soma dos números multiplos de 4 e a quantidade de multiplos de três
public class C08EX06 {
    public static void main(String[] args) {
        int numero, soma=0, cont=0;
        Scanner teclado = new Scanner(System.in);
        for (int aux=1; aux<=10; aux++) {
            System.out.println("informe um número inteiro");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("o número é par.");
            } else {
                System.out.println("O número é impar.");
            }
            if (numero % 4 == 0) {
                soma += numero;
            }
            if (numero % 3 == 0) {
                    cont++;
            }
        }
        System.out.println("A soma dos números divisiveis por 4 é: " + soma);
        System.out.println(cont + " números são divisíveis por 3.");
        teclado.close();
    }
}
