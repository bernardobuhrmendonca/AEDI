package etapa1;
//Função: calcular o imposto de renda
//Autor: Bernardo Buhr Alves Mendonça
import java.util.Scanner;
public class C05EX03 {
    public static void main(String[] args) {
        double salario, sLiq, impRenda;
        long nDep;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu salário? ");
        salario = teclado.nextDouble();
        System.out.println("Quantos dependentes você tem? ");
        nDep = teclado.nextLong();

        sLiq = salario - (nDep * 60.0);

        impRenda = 15 * sLiq / 100;

        System.out.printf("O seu imposto de renda é R$%1.2f: ", impRenda);

    }
}
