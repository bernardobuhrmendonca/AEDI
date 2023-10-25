package etapa1;
//Função: calcular a média poderada das notas de um aluno
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX09 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi a primeira nota? ");
        nota1 = teclado.nextDouble();
        System.out.println("Qual foi a segunda nota? ");
        nota2 = teclado.nextDouble();
        System.out.println("Qual foi a terceira nota? ");
        nota3 = teclado.nextDouble();

        media = (2 * nota1 + 3 * nota2 + 5 * nota3) / 10;

        System.out.println("A média final do aluno será: " + media);

    }

}
