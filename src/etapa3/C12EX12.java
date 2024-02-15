package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir os nomes de todos os alunos que tiveram a maior nota

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[50];
        double notaM=0;
        double[] nota = new double[50];
        for (int aux = 0; aux<nota.length;aux++){
            System.out.println("Indique o nome do aluno.");
            nome[aux] = teclado.nextLine();
            System.out.println("Indique a nota do aluno.");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();
            if (notaM<=nota[aux]){
                notaM = nota[aux];
            }
        }
        System.out.println("Alunos com a maior nota:");
        for (int aux = 0; aux<nota.length;aux++){
            if (notaM==nota[aux]){
                System.out.println(nome[aux]);
            }
        }
        teclado.close();
    }
}
