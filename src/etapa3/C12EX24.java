package etapa3;

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] time = new String[20];
        String tempS;
        int[] pontuacao = new int[20];
        int cont= pontuacao.length-1, temp;
        for (int aux=1; aux<pontuacao.length; aux++){
            System.out.println("Indique o nome de algum time.");
            time[aux] = teclado.nextLine();
            System.out.println("Indique a pontuação deste time.");
            pontuacao[aux] = teclado.nextInt();
        }
        for (int aux=0; aux< pontuacao.length-1; aux++){
            for (int x=0; x<cont; x++){
                if (pontuacao[aux]<pontuacao[aux+1]){
                    temp = pontuacao[aux];
                    pontuacao[aux] = pontuacao[aux+1];
                    pontuacao[aux+1] = temp;
                    tempS = time[aux];
                    time[aux] = time[aux+1];
                    time[aux+1] = tempS;
                }
            }
            cont--;
        }
        for (int aux=1; aux<pontuacao.length; aux++){
            if (aux<=3){
                System.out.println(time[aux] + " - Copa Libertadores");
            } else if (aux<=11) {
                System.out.println(time[aux] + " - Copa Sul-americana");
            }else if (aux>=16) {
                System.out.println(time[aux] + " - Rebaixado");
            }
        }
        teclado.close();
    }
}
