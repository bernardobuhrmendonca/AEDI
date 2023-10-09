package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular multa por atraso no pagamento de um imposto
public class C07EX03 {
    public static void main(String[] args) {
        int dias;
        double multa, imposto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor do imposto? ");
        imposto = teclado.nextDouble();
        System.out.println("O pagamento atrasou quantos dias? ");
        dias = teclado.nextInt();
        switch(dias){
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("A multa será nula");
                break;
            case 6: case 7: case 8:
                multa = imposto * 2 / 100.0;
                System.out.printf("A multa será de: R$%1.2f",multa);
                break;
            case 9: case 10:
            multa = 10 * imposto / 100 + 5 / 1000.0 * dias * imposto;
                System.out.printf("A multa será de: R$%1.2f",multa);
                break;
            default:
                multa = 150 * imposto / 100 + dias;
                System.out.printf("Amulta será de: R$%1.2f",multa);
                break;
        }
        teclado.close();
    }
}
