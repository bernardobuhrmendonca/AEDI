package etapa1;
//Autor: Bernardo Buhr Alves Mendonça
//Função: Imprimir dados pessoais de acordo com um modelo
import java.util.Scanner;
public class C04EX01 {
    public static void main(String[] args) {
        String nome, nomeMeio, sobrenome;
        long idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu primeiro nome? ");
        nome = teclado.nextLine();
        System.out.println("Qual seu nome do meio? ");
        nomeMeio = teclado.nextLine();
        System.out.println("Qual o seu último nome? ");
        sobrenome = teclado.nextLine();
        System.out.println("Qual a sua idade? ");
        idade = teclado.nextLong();

        System.out.println();

        System.out.println(sobrenome + ", " + nome + " " + nomeMeio);
        System.out.println("Idade: " + idade + " anos.");
        teclado.close();
    }
}
