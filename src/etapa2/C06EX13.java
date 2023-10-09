package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular a duração de determinado jogo
public class C06EX13 {
    public static void main(String[] args) {
        int hi, hf, mi, mf, hora, minutos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o valor numérico inicial das horas.");
        hi = teclado.nextInt();
        System.out.println("Indique o valor numérico final das horas.");
        mi = teclado.nextInt();
        System.out.println("Indique o valor numérico inicial dos minutos.");
        hf = teclado.nextInt();
        System.out.println("Indique o valor numérico final dos minutos.");
        mf = teclado.nextInt();
        if (mi>mf){
            hora = hf - hi - 1;
            minutos = mf - mi + 60;
        }else{
            hora = hf - hi;
            minutos = mf - mi;
        }
        System.out.println("o jogo durou " + hora + " horas e " + minutos + " minutos.");
        teclado.close();
    }
}
