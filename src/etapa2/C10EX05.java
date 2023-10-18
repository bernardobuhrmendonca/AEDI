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

    public static class D22698C {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String nomeC, nomeM="";
            int dataV, dataP, cont=0;
            double valorP, valorPF, somaD=0, somaM=0, diferenca, mod, media, maiorM=0, multa, somaT=0;
            do {
                System.out.println("Indique o nome do cliente.");
                nomeC = teclado.nextLine();
                if (nomeC.equalsIgnoreCase("X")){
                    System.out.println("O programa será encerrado.");
                    break;
                }
                System.out.println("Indique o dia do vencimento.");
                dataV = teclado.nextInt();
                System.out.println("Indique o dia do pagamento.");
                dataP = teclado.nextInt();
                do {
                    System.out.println("Indique o valor da prestação.");
                    valorP = teclado.nextDouble();
                    teclado.nextLine();
                    if (valorP<=0){
                        System.out.println("Valor de prestação inválido. Digite novamente.");
                    }
                    cont++;
                }while (valorP<=0);
                if (dataV-dataP>=0){
                    valorPF = valorP - valorP * 10 / 100;
                    somaD += valorP * 10 / 100;
                }else{
                    if (dataP-dataV<=5){
                        valorPF = valorP;
                    }else{
                        valorPF = valorP + 2 * valorP / 100 * (dataP - dataV);
                        multa = 2 * valorP / 100 * (dataP - dataV);
                        if (multa>maiorM){
                            maiorM = multa;
                            nomeM = nomeC;
                        }
                        somaM += multa;
                    }
                }
                somaT += valorPF;
                System.out.println("NOME: " + nomeC );
                System.out.printf("VALOR A SER PAGO: R$%1.2f\n", valorPF);
            }while(!nomeC.equalsIgnoreCase("X"));
            diferenca = somaD - somaM;
            media = somaT / cont;
            if (diferenca<0){
                mod = diferenca * -1;
            }else{
                mod = diferenca;
            }
            System.out.printf("A diferença entre o valor dos descontos e das multas é: R$%1.2f \nA média dos valores pagos pelos clientes é: R$%1.2f\n", mod, media);
            System.out.println("Cliente que pagou a maior multa: " + nomeM);
            teclado.close();
        }
    }
}
