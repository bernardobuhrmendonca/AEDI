package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: método main da função anterior

import java.util.Scanner;

import static etapa3.C13EX02A.ex2;

public class C13EX02B {
    public static void main(String[] args) {
        double x;
        do {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique um valor para x.");
        x = teclado.nextDouble();
        if (x==-1){
            break;
        }
        System.out.println("f(x)= " + ex2(x));
        }while(x!=-1);
    }
}
