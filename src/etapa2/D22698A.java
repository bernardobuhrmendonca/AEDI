package etapa2;

import java.util.Scanner;

//Aluno: Bernardo Buhr Alves Mendonça
//Função: determinar o valor de f(x) para 3 difrentes possibilidades

public class D22698A {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um número.");
        x = teclado.nextDouble();
        if (x<0){
            fx = -1;
        }else{
            if (x==0){
                fx = 1;
            }else{
                fx = Math.pow(x,2.0) + Math.pow(2*x,1/2.0) + 3;
            }
        }
        System.out.println("f(x)=" + fx);
    }
}
