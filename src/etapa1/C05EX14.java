package etapa1;
import java.util.Scanner;
public class C05EX14 {
    public static void main(String[] args) {
        double vel, tempo, tempoR;
        final double luz = 3 * Math.pow(10,8);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor do tempo(s)? ");
        tempo = teclado.nextDouble();
        System.out.println("Qual o valor da velocidade? ");
        vel = teclado.nextDouble();
        tempoR = tempo / Math.sqrt(1 -Math.pow(vel,2) / Math.pow(luz,2));
        System.out.printf("O valor do tempo relativo é %1.4f segundos." , tempoR);
    }
}
