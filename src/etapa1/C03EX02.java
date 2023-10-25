package etapa1;
import java.util.Scanner;
    public class C03EX02 {
        // Função: calcule a média de 3 números inteiros
        // Autor: Bernardo Buhr Alves Mendonça
        public static void main(String[] args) {
            long n1, n2, n3, soma;
            double media;
            Scanner teclado = new Scanner(System.in);
            System.out.print("informe um número: ");
            n1 = teclado.nextLong();
            System.out.print("informe outro número: ");
            n2 = teclado.nextLong();
            System.out.print("informe mais um número: ");
            n3 = teclado.nextLong();
            soma = n1 + n2 + n3;
            media = soma / 3.0;
            System.out.println("Média = " + media);
            teclado.close();
        }
    }