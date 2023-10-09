package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o peso ideal de uma pessoa
public class C06EX08 {
    public static void main(String[] args) {
        double peso_m, peso_M, altura;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o nome da pessoa. ");
        nome = teclado.nextLine();
        System.out.println("Indique a altura da pessoa. ");
        altura = teclado.nextDouble();
        peso_m = Math.pow(altura,2.0) * 20;
        peso_M = Math.pow(altura,2.0) * 25;
        System.out.printf("Para que " + nome + " esteja no peso ideal ela tem que pesar no mínimo %1.2fkg e no máximo %1.2fkg.",peso_m,peso_M);
        teclado.close();
    }
}
