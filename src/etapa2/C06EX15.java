package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular mensalidade de uma operadora de canais
public class C06EX15 {
    public static void main(String[] args) {
        String cidade;
        int cod, dias, valfix=0;
        double mensalidade, extras, imp, ppp=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a sua cidade. ");
        cidade = teclado.nextLine();
        teclado.nextLine();
        if (cidade.equalsIgnoreCase("Belo Horizonte")){
           imp = 0;
        }else{
            if (cidade.equalsIgnoreCase("São Paulo")){
                imp = 1 / 100.0;
            }else{
                if (cidade.equalsIgnoreCase("Rio de Janeiro")){
                    imp = 1.5 /100.0;
                }else{
                    imp = 2 / 100.0;
                }
            }
        }
        System.out.println("Informe o número de dias de consumo dos canais PPP. ");
        dias = teclado.nextInt();
        System.out.println("Informe o código do seu plano. ");
        cod = teclado.nextInt();
        if (cod == 1){
            valfix = 65;
            ppp = 1.2 * dias;
        }else{
            if (cod == 2){
                valfix = 104;
                ppp = 2.1 * dias;
            }else{
                if (cod == 3){
                    valfix = 137;
                    ppp = 0;
                }else{
                    System.out.println("Código inválido.");
                    teclado.close();
                }
            }
        }
        System.out.println("Informe o valor consumido de serviços extras. ");
        extras = teclado.nextDouble();
        mensalidade = valfix + ppp + imp + extras;
        System.out.printf("Mensalidade: R$%1.2f",mensalidade);
    }
}
