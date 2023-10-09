package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: emitir o prêmio de determinado apostador
public class C07EX01 {
    public static void main(String[] args) {
        String nome;
        int acertos, premio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome do apostador: ");
        nome = teclado.nextLine();
        System.out.println("Quantos jogos foram acertados?");
        acertos = teclado.nextInt();
        switch(acertos){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("O apostador " + nome + " não ganhou nenhum prêmio.");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("O apostador " + nome + " ganhou outro cartão de aposta.");
                break;
            case 11:
                System.out.println("O apostador " + nome + " ganhou R$100,00.");
                break;
            case 12:
                System.out.println("O apostador " + nome + " ganhou R$1000,00.");
                break;
            case 13:
                System.out.println("O apostador " + nome + " ganhou R$50000,00");
                break;
            default:
                System.out.println("Valor de acertos inválido");
        }
        teclado.close();
    }
}
