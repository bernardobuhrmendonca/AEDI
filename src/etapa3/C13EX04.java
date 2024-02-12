package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: função que simula um jogo de acertar um número inteiro com dicas, de acordo com os palpites do usuário, e o método main

import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) {
        ex4();
    }
    public static void ex4(){
        double random, numero, cont=0;
        random = Math.random() * 100;
        random = Math.round(random);
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Indique um número.");
            numero = teclado.nextDouble();
            cont++;
            if (numero==random){
                System.out.println("Parabéns você acertou!");
                System.out.println("O número de tentativas foi: " + cont);
            }else if (numero<random) {
                System.out.println("O número aleatório é maior do que o indicado.");
            }else{
                System.out.println("O número aleatório é menor do que o indicado.");
            }
        }while(numero!=random);
    }
}
