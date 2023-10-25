package etapa1;
import java.util.Scanner;
// Função: expressar o tempo de um evento, que foi dado em segundos, em horas, minutos e segundos
//Autor: Bernardo Buhr Alves Mendonça
public class C05EX12 {
    public static void main(String[] args) {


        long hora, min, seg, tempo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a duração do evento em segundos. ");
        tempo = teclado.nextLong();

        hora = tempo / 3600;
        min = tempo % 3600 / 60;
        seg = tempo % 3600 % 60;

        System.out.println("A duração do evento será de " + hora + " horas, " + min + " minutos e " + seg + " segundos.");
    }
}
