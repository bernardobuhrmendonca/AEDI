package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: avaliar se determinado aluno foi aprovado ou não
public class C08EX02 {
    public static void main(String[] args) {
        double nota;
        int faltas;
        Scanner teclado = new Scanner(System.in);
        for (int aux=1; aux<=50;aux++) {
            System.out.println("Qual a pontuação obtida pelo aluno?");
            nota = teclado.nextDouble();
            if (nota == -1)
                break;
            System.out.println("Qual o número de faltas do aluno?");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Aluno aprovado. ");
            } else {
                    System.out.println("Aluno reprovado. ");
            }
        }
        teclado.close();
    }
}
