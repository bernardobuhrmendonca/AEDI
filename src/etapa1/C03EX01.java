package etapa1;
import java.util.Scanner;
    public class C03EX01 {
    //Função: Calcular o fatorial de um número
    //Autor: Bernardo Buhr Alves Mendonça
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("informe um número: ");
            long numero = teclado.nextLong();
            long fatorial = 1L;
            for(long contador = 2; contador <= numero; contador++){
                fatorial = fatorial * contador;
            }
            System.out.println("fatorial = " + fatorial);
            teclado.close();
        }
}
