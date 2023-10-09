package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar quantos alunos tem 18 anos ou menos e quantos tem mais de 18 anos
public class C08EX04 {
    public static void main(String[] args) {
        String nome;
        int idade, cont=0;
        Scanner teclado = new Scanner(System.in);
        for (int aux=1;aux<=50; aux++) {
            System.out.println("Indique o nome do aluno.");
            nome = teclado.nextLine();
            System.out.println("Indique a idade do aluno.");
            idade = teclado.nextInt();
            if (idade > 18) {
                cont++;
            }
            teclado.nextLine();
        }
        System.out.println("Alunos com 18 anos ou menos: " + (50-cont) +
                "\nAlunos com mais de 18 anos: " + cont);
    }
}
