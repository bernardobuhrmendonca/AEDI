package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir quantas pessoas responderam à pesquisa, o número de homens e de mulheres, a altura média dos homens e a quantidade de mulheres com peso inferior a 60kg
public class C10EX05 {
    public static void main(String[] args) {
        String sexo;
        double altura, peso, cont=0, contF=0, contM=0, contP=0, alturaM=0;
        Scanner teclado = new Scanner(System.in);
        do {
            do {
                System.out.println("Indique o seu sexo por F ou M.");
                sexo = teclado.nextLine();
                if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    System.out.println("Termo inválido. digite novamente");
                }else{
                    cont++;
                }
                }while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) ;
            System.out.println("Indique a sua altura em metros.");
            altura = teclado.nextDouble();
            System.out.println("Indique o seu peso em kg.");
            peso = teclado.nextDouble();
            if (sexo.equalsIgnoreCase("F")) {
                cont++;
                if (peso<60.0){
                    contP++;
                }
            }else {
                contM++;
                alturaM += altura / contM;
            }
            teclado.nextLine();
        }while(!sexo.equalsIgnoreCase("FIM"));
        System.out.println("Pessoas  pesquisadas: " + cont +
                "\nMulheres: " + contF +
                "\nHomens: " + contM +
                "\nMulheres com menos de 60kg: " + contP +
                "\nAltura média dos homens: " + alturaM);
        teclado.close();
    }
}
