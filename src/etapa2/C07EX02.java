package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular a média inteira das notas de um aluno
public class C07EX02 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a primeira nota do aluno?");
        nota1 = teclado.nextInt();
        System.out.println("Qual a segunda nota do aluno?");
        nota2 = teclado.nextInt();
        System.out.println("Qual a terceira nota do aluno?");
        nota3 = teclado.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        switch(media){
            case 1: case 2: case 3: case 4:
                System.out.println("Conceito: E.");
                break;
            case 5: case 6:
                System.out.println("Conceito: D.");
                break;
            case 7:
                System.out.println("Conceito: C.");
                break;
            case 8:
                System.out.println("Conceito: B.");
                break;
            case 9: case 10:
                System.out.println("Conceito: A.");
                break;
            default:
                System.out.println("valor de notas inválido");
                break;
        }
        teclado.close();
    }
}
