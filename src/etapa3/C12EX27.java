package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: sistema de pesquisa de alunos cadastrados, com o uso do número de matrícula deste

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {
        String MATRICULA, NOME, nomeP;
        Scanner teclado = new Scanner(System.in);
        List<String> nome = new ArrayList<String>();
        List<String> matricula = new ArrayList<String>();
        do{
            System.out.println("Indique o nome do aluno.");
            NOME = teclado.nextLine();
            if (NOME.equalsIgnoreCase("x")){
                break;
            }
            nome.add(NOME);
            System.out.println("Indique a matrícula deste aluno.");
            MATRICULA = teclado.nextLine();
            matricula.add(MATRICULA);
        }while(!NOME.equalsIgnoreCase("x"));
        int cont = nome.size() -1;
        for (int aux=0; aux<nome.size()-1; aux++){
            for (int aux2=0; aux2<cont; aux2++){
                if (nome.get(aux2).compareToIgnoreCase(nome.get(aux2+1))>0){
                    String temp = nome.get(aux2+1);
                    nome.set(aux2+1,nome.get(aux2));
                    nome.set(aux2,temp);
                    temp = matricula.get(aux2+1);
                    matricula.set(aux2+1,matricula.get(aux2));
                    nome.set(aux2,temp);
                }
            }
            cont--;
        }
        System.out.println("Indique um nome a ser pesquisado.");
        nomeP = teclado.nextLine();
        for (int aux=0; aux<nome.size(); aux++){
            if (nomeP.equalsIgnoreCase(nome.get(aux))){
                System.out.println("RA(" + (aux+1) + "): " + matricula.get(aux));
            } else if (aux==nome.size()-1) {
                System.out.println("Nome não encontrado.");
            }
        }
    }
}
