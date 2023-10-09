package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: computar 100 votos e indicar o candidato eleito
public class C08EX05 {
    public static void main(String[] args) {
        int voto, contF = 0, contC = 0, contB = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 100; aux++) {
            System.out.println("Indique o número de seu candidato");
            voto = teclado.nextInt();
            if (voto != 1 && voto != 2 && voto != 3) {
                System.out.println("Opção inválida.");
                break;
            } else {
                if (voto == 1) {
                    contF++;
                } else {
                    if (voto == 2) {
                        contC++;
                    } else {
                        contB++;
                    }
                }
            }
        }
        System.out.println("Fulano: " + contF + " votos");
        System.out.println("Ciclano: " + contC + " votos");
        System.out.println("Beltrano: " + contB + " votos");
        if (contF>contC&&contF>contB){
            System.out.println("O candidato Fulano foi eleito com " + contF + " votos.");
        }else{
            if (contC>contF&&contC>contB){
                System.out.println("O candidato Ciclano foi eleito com " + contC + " votos.");
            }else{
                if (contB>contF&&contB>contC){
                    System.out.println("O candidato Beltrano foi eleito com " + contB + " votos.");
                }else{
                    System.out.println("Holve um empate. A votação será anulada.");
                }
            }
        }
        teclado.close();
    }
}
