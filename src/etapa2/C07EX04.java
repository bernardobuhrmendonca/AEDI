package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar à qual estado pertence o time indicado
public class C07EX04 {
    public static void main(String[] args) {
        String time;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um time.");
        time = teclado.nextLine();
        switch(time){
            case "Atlético": case "Cruzeiro": case "América": case "Villa Nova":
                System.out.println("Minas Gerais.");
                break;
            case "Vasco": case "Botafogo": case "Fluminense": case "Flamengo":
                System.out.println("Rio de Janeiro.");
                break;
            case "Corinthians": case "Palmeiras": case "São Paulo.": case "Santos":
                System.out.println("São Paulo.");
                break;
            case "Grêmio": case "Internacional": case "Juventude":
                System.out.println("Rio Grande do Sul.");
                break;
            case "Naútico": case "Santa Cruz": case "Sport":
                System.out.println("Pernambuco.");
            default:
                System.out.println("Time inválido.");
        }
    }
}
