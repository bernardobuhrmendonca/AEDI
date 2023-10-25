package etapa1;
// Função: identificar quais dígitos do número do cheque se referem ao banco, à agência e ao número sequencial
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX11 {
    public static void main(String[] args) {
        long X0, banco, agen, seq;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número do cheque. ");
        X0 = teclado.nextLong();
        banco = X0 / 1000000;
        agen = X0 % 1000000 / 1000;
        seq = X0 % 1000;
        System.out.println("-> Banco=" + banco + " Agência=" + agen + " Sequencial=" + seq);
    }
}
