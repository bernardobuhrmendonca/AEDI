package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular o pesso ideal de uma pessoa
public class C06EX09 {
    public static void main(String[] args) {
        double pesoI, altura;
        String gen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("indique o seu gênero por 'M' para masculino e 'F' para feminino. ");
        gen = teclado.nextLine();
        System.out.println("Indique a sua altura em metros. ");
        altura = teclado.nextDouble();
        if (gen.equalsIgnoreCase("M")){
            pesoI = 72.7 * altura - 58;
            System.out.printf("O seu peso ideal é: %1.2fkg",pesoI);
        }else{
            pesoI = 62.1 * altura - 44.7;
            System.out.printf("O seu peso ideal é: %1.2fkg",pesoI);
        }
        teclado.close();
    }
}

