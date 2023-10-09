package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o IMC de alguma pessoa
public class C06EX04 {
    public static void main(String[] args) {
        double peso, altura, IMC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu peso?(em kg) ");
        peso = teclado.nextDouble();
        System.out.println("Qual a sua altura?(em metros) ");
        altura = teclado.nextDouble();
        IMC = peso / Math.pow(altura,2.0);
        if(IMC<18){
            System.out.println("A pessoa está desnutrida");
        }else{
            if(IMC<20){
                System.out.println("Apessoa está abaixo do peso");
            }else{
                if(IMC<=25){
                    System.out.println("A pessoa está no peso ideal");
                }else{
                    if(IMC<=27){
                        System.out.println("A pessoa está acima do peso");
                    }else{
                        System.out.println("A pessoa está obesa");
                    }
                }
            }
        }
        teclado.close();
    }
}
