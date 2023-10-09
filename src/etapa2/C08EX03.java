package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: avaliar se determinado aluno foi aprovado ou não e a quantidade de aprovados e reprovados
public class C08EX03 {
    public static void main(String[] args) {
        double nota;
        int faltas, cont=0;
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
                cont++;
            } else {
                System.out.println("Aluno reprovado. ");
            }
        }
        System.out.println("Aprovados: "+ cont +
                "\nReprovados: " + (50-cont));
        teclado.close();
    }
}