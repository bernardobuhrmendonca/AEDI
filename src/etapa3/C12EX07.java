package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: definir o conceito de cada aluno dde acordo com as respectivas notas de cada um deles

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String conceito;
        String[] nome = new String[50];
        double[] nota = new double[50];
        for (int aux = 0; aux< nota.length; aux++){
            System.out.println("Indique o nome do aluno.");
            nome[aux] = teclado.nextLine();
            System.out.println("Indique a nota do aluno.");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();
        }
        System.out.println("Alunos:\t\t\t\tNotas:\t\tConceito:");
        for (int aux = 0; aux< nota.length; aux++){
            if (nota[aux]<=30){
                conceito = "D";
            } else if (nota[aux]<=60) {
                conceito = "C";
            } else if (nota[aux]<=80) {
                conceito = "B";
            }else{
                conceito = "A";
            }
            System.out.println(nome[aux] + "\t\t\t\t" + nota[aux] + "\t\t" + conceito);
        }
        teclado.close();
    }
}
