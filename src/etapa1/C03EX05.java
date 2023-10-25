package etapa1;
//Função: Calcular a idade de uma pessoa em determinado ano
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C03EX05 {
    public static void main(String[] args) {
        String nome;
        int anoNasc, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.println("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println(nome + "Você tem/terá " + idade + " anos em " + anoAtual);
        teclado.close();
    }
}
