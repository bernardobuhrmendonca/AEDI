package etapa2;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        String codigo, nome, nomeSM="", codigoMS="";
        double salario, somaA=0, mediaA, menor$=Double.MAX_VALUE, contX=0, contT;
        int contC=0, contO=0, contA=0, contP=0;
        Scanner arquivo = new Scanner(
                C08EX31.class.getResourceAsStream("C08EX31.txt"));
        while (arquivo.hasNextLine()) {
            nome = arquivo.nextLine();
            salario = arquivo.nextDouble();
            arquivo.nextLine();
            codigo = arquivo.nextLine();
            if (codigo.equalsIgnoreCase("C")) {
                if (salario >= 2500) {
                    contC++;
                    codigo = "Engenheiro Civil";
                } else {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO.");
                }
            }
            if (codigo.equalsIgnoreCase("P")) {
                if (salario >= 4650) {
                    contP++;
                    codigo = "Engenheiro Projetista";
                } else {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO.");
                }
            }
            if (codigo.equalsIgnoreCase("O")) {
                if (salario >= 3200) {
                    contO++;
                    codigo = "Engenheiro de Obra";
                } else {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO.");
                }
            }
            if (codigo.equalsIgnoreCase("A")) {
                if (salario >= 5100) {
                    somaA+= salario;
                    contA++;
                    codigo = "Engenheiro Administrativo";
                } else {
                    System.out.println("ABAIXO DO SALÁRIO MÍNIMO.");
                }
            }
            if (codigo.equalsIgnoreCase("X")) {
                if (salario>5000){
                contX++;
                codigo = "Outros";
                }
            }
            if (salario<menor$){
                menor$ = salario;
                nomeSM = nome;
                codigoMS = codigo;
            }
        }
        mediaA = somaA / contA;
        contT = contA + contC + contO + contP;
        System.out.printf("b)%1.0f\nc)R$%1.2f\nd)%1.0f",contT,mediaA,contX);
        System.out.println();
        System.out.print("e) " + nomeSM + ", " + codigoMS + ", ");
        System.out.printf("R$%1.2f",menor$);
        arquivo.close();
        }
    }
