package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: indicar a média da nota dos alunos aprovados e o numero de alunos com mais de 16 faltas
public class C08EX08 {
    public static void main(String[] args) {
        double nota,media=0;
        int faltas, contA=0, contF=0;
        Scanner teclado = new Scanner (System.in);
        for (int aux = 1; aux<=50; aux++){
            System.out.println("Indique a nota final do aluno.");
            nota = teclado.nextDouble();
            System.out.println("Indique o número de faltas do aluno.");
            faltas = teclado.nextInt();
            if (faltas>=16){
                System.out.println("Aluno reprovado.");
                contF++;
            }else{
                if (nota<65){
                    System.out.println("Aluno reprovado.");
                }else{
                    System.out.println("Aluno aprovado.");
                    contA++;
                    media+= nota / contA;
                }
            }
        }
        System.out.println("A média da nota dos alunos aprovados é: " + media +
                "\nA quantidade de alunos com mais de 16 faltas é: " + contF);
        teclado.close();
    }
}
