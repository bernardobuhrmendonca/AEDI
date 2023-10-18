package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Funçao: calcula média de determinado aluno de uma escola de idiomas
public class C06EX16 {
    public static void main(String[] args) {
        int faltas, p1, p2, idade;
        double nota1, nota2, nota3, notaTF, notaF, mediaN;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas faltas o aluno possui? ");
        faltas = teclado.nextInt();
        System.out.println("Qual a nota da primeira prova? ");
        nota1 = teclado.nextDouble();
        System.out.println("Qual a nota da segunda prova? ");
        nota2 = teclado.nextDouble();
        System.out.println("Qual a nota da terceira prova? ");
        nota3 = teclado.nextDouble();
        System.out.println("Qual a nota do trabalho final? ");
        notaTF = teclado.nextDouble();
        System.out.println("Qual a idade do aluno? ");
        idade = teclado.nextInt();
        if (faltas<=5){
            p1 = 3;
        }else{
            if (faltas<=10){
                p1 = 2;
            }else{
                p1 = 1;
            }
        }
        if (idade<=17){
            p2 = 1;
        }else{
            if (idade<=50){
                p2 = 2;
            }else{
                p2 = 3;
            }
        }
        if (nota1>nota2||nota2>nota1&&nota2>nota3||nota1>nota3){
            mediaN = nota1 + nota2 / 2.0;
        }else{
            if (nota2>nota3||nota3>nota2&&nota3>nota1||nota2>nota1){
                mediaN = nota2 + nota3 / 2.0;
            }else {
                mediaN = nota1 + nota3 / 2.0;
            }
        }
        notaF = mediaN * p1 + notaTF * p2;
        if (notaF<=50){
            System.out.println("Resultado: reprovado.");
        }else{
            if(notaF<=70){
                System.out.println("Resultado: regular.");
            }else{
                if (notaF<=80){
                System.out.println("Resultado: bom.");
                }else{
                    if (notaF<=90){
                        System.out.println("Resultado: muito bom.");
                    }else{
                        System.out.println("Resultado: excelente.");
                    }
                }
            }
        }
        teclado.close();
    }
}
