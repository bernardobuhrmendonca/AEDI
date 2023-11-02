package etapa3;

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, digito, resultado;
        do{
            System.out.println("Indique um número com no máximo 9 digitos.");
            numero = teclado.nextDouble();
        }while (numero>999999999||numero%1!=0);
        System.out.println("Indique a posição do dígito que deverá ser emitido.");
        digito = teclado.nextDouble();
        resultado = ex3(numero,digito);
        System.out.println("O dígito na posição " + digito + " é " + resultado);
    }
    static double ex3(double numero, double digito){
        double resultadoD, resultado;
        resultadoD = numero % Math.pow(10,digito) / Math.pow(10,digito-1);
        resultado= Math.floor(resultadoD);
        return resultado;
    }
}
