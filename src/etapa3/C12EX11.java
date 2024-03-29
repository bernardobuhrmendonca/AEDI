package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o nome do aluno com a maior nota indicada (em caso de empate o aluno indicado primeiro será o impresso)

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, alunoMN="";
        double nota, maiorN=0;
        for (int aux = 0; aux < 50; aux++) {
            System.out.println("Indique o nome do aluno.");
            nome = teclado.nextLine();
            System.out.println("Indique a nota do aluno.");
            nota = teclado.nextDouble();
            if (nota>maiorN){
                maiorN = nota;
                alunoMN = nome;
            }
            teclado.nextLine();
        }
        System.out.println(alunoMN + " foi o aluno com maior nota");
        teclado.close();
    }
}
