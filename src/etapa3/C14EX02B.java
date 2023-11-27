package etapa3;

import java.util.Scanner;

public class C14EX02B {
    public static void main(String[] args) {
        double area=0, lado, base, altura, raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a foma geométrica que você deseja calcular a área.");
        System.out.println("1 - Quadrado.");
        System.out.println("2 - Retângulo.");
        System.out.println("3 - Triângulo.");
        System.out.println("4 - Círculo.");
        int opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Indique o valor do lado.");
                lado = teclado.nextDouble();
                area = C14EX02A.quadrado(lado);
                break;
            case 2:
                System.out.println("Indique o valor da base.");
                base = teclado.nextDouble();
                System.out.println("Indiique o valor da altura.");
                altura = teclado.nextDouble();
                area = C14EX02A.retangulo(base, altura);
                break;
            case 3:
                System.out.println("Indique o valor da base.");
                base = teclado.nextDouble();
                System.out.println("Indiique o valor da altura.");
                altura = teclado.nextDouble();
                area = C14EX02A.triangulo(base, altura);
                break;
            case 4:
                System.out.println("Indique o valor do raio.");
                raio = teclado.nextDouble();
                area = C14EX02A.circulo(raio);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        if (opcao>0 && opcao<5){
            System.out.println("Área: " + area);
        }
        teclado.close();
    }
}
