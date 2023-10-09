package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o número de pontos ganhos por determinada equipe de vôlei
public class C06EX11 {
    public static void main(String[] args) {
        int p1, p2;
        String nome1, nome2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique o nome da primeira equipe.");
        nome1 = teclado.nextLine();
        System.out.println("Quantos sets a equipe " + nome1 + " ganhou?");
        p1 = teclado.nextInt();
        System.out.println("Indique o nome da primeira equipe.");
        nome2 = teclado.nextLine();
        System.out.println("Quantos sets a equipe " + nome2 + " ganhou?");
        p2 = teclado.nextInt();
        if (p1==3&&p2<=1){
            System.out.println(nome1 + ": 3 pontos.");
            System.out.println(nome2 + ": 0 pontos.");
        }else{
            if (p1==3&&p2==2){
                System.out.println(nome1 + ": 3 pontos.");
                System.out.println(nome2 + ": 1 pontos.");
            }else{
                if (p1<=1&&p2==3){
                    System.out.println(nome1 + ": 0 pontos.");
                    System.out.println(nome2 + ": 3 pontos.");
                }else{
                    if (p1==2&&p2==3){
                        System.out.println(nome1 + ": 2 pontos.");
                        System.out.println(nome2 + ": 3 pontos.");
                    }else{
                        System.out.println("Valores indicados inválidos.");
                    }
                }
            }
        }
        teclado.close();
    }
}
