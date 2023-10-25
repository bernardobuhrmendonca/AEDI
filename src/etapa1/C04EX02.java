package etapa1;
//Função: emitir ficha funcional formatada
//Autor: BernardoBuhr Alves Mendonça
import java.util.Scanner;
public class C04EX02 {
    public static void main(String[] args) {
       String nome, CPF, RG, tEleitor, empresa;
       double salario;
       long cartMot;
       Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome completo? ");
        nome = teclado.nextLine();
        System.out.println("Qual o seu CPF(xxx.xxx.xxx-xx)? ");
        CPF = teclado.nextLine();
        System.out.println("Qual o seu RG (UF-xx.xxx.xxx)? ");
        RG = teclado.nextLine();
        System.out.println("Qual o número do seu título de eleitor (xxxx.xxxx/xx)? ");
        tEleitor = teclado.nextLine();
        System.out.println("Qual o nome da empresa na qual você trabalha? ");
        empresa = teclado.nextLine();
        System.out.println("Qual o seu salário? ");
        salario = teclado.nextDouble();
        System.out.println("Qual o número da sua carteira de motorista (xxxxxxxxxxxx)? ");
        cartMot = teclado.nextLong();

        System.out.println();

        System.out.println("FICHA FUNCIONAL DE: " + nome);
        System.out.println();
        System.out.println("Documentos: ");
        System.out.println("CPF ...........................    " + CPF);
        System.out.println("C.I. ..........................    " + RG);
        System.out.println("Título de eleitor .............    " + tEleitor);
        System.out.println("Carteira de motorista .........    " + cartMot);
        System.out.println();
        System.out.println("Empresa: " + empresa);
        System.out.printf("Salário: R$%1.2f",salario);
    }
}
