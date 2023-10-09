package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Funçao: emitir o salário de vendedores comissionados de acordo com o valor de sua venda
public class C06EX03 {
    public static void main(String[] args) {
        double salario, vendas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor mensal vendido? ");
        vendas = teclado.nextDouble();
        if(vendas<=100){
            salario = 240;
        }else{
            if(vendas>100&&vendas<=10000){
                salario = 240 + vendas * 10.0 / 100;
            }else{
                salario = 240 + 1000;
            }
        }
        System.out.println("Vendas: " + vendas);
        System.out.println("Salário: " + salario);
        teclado.close();
    }
}
