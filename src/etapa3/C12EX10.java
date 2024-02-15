package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: indicar quais dos alunos indicados pelo usuário ficaram acima da média aritmética das notas

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[50];
        double[] nota = new double[50];
        double soma=0, media;
        for (int aux = 0; aux < nota.length; aux++) {
            System.out.println("Indique o nome do aluno.");
            nome[aux] = teclado.nextLine();
            System.out.println("Indique a nota do aluno.");
            nota[aux] = teclado.nextDouble();
            soma+=nota[aux];
            teclado.nextLine();
        }
        media = soma / 50;
        System.out.println("Alunos que ficaram acima da média:");
        for (int aux = 0; aux<nota.length; aux++){
            if (nota[aux]>=media){
                System.out.println(nome[aux]);
            }
        }
        teclado.close();
    }
}
