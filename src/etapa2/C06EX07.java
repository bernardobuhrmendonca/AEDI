package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o PL de determinado funcionário
public class C06EX07 {
    public static void main(String[] args) {
        double salario, plB, plL;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o salário do funcionário. ");
        salario = teclado.nextDouble();
        if (salario<=300.0){
            plB = 500.0 + 70 / 100.0 * salario;
            plL = plB - 25 / 100.0 * plB;
            System.out.printf("O PL líquido será de:R$%1.2f. ",plL);
        }else{
            if(salario>300.0&&salario<=1000.0){
                plB = 200.0 + 50 / 100.0 * salario;
                plL = plB - 25 / 100.0 * plB;
                System.out.printf("O PL líquido será de:R$%1.2f. ",plL);
            }else{
                plB = 30 / 100.0 * salario;
                plL = plB - 25 / 100.0 * plB;
                System.out.printf("O PL líquido será de:R$%1.2f. ",plL);
            }
        }
        teclado.close();
    }
}
