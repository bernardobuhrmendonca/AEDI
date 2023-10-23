package etapa2;

import java.util.Scanner;

//Aluno: Bernardo Buhr Alves Mendonça
//Função: computar dados de um banco e emitir alguns deles

public class D22698C {
    public static class D22698 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String nomeM = "";
            int cont = 0;
            double somaD = 0.0;
            double somaM = 0.0;
            double maiorM = 0.0;
            double somaT = 0.0;

            String nomeC;
            do {
                System.out.println("Indique o nome do cliente.");
                nomeC = teclado.nextLine();
                if (nomeC.equalsIgnoreCase("X")) {
                    System.out.println("O programa será encerrado.");
                    break;
                }

                System.out.println("Indique o dia do vencimento.");
                int dataV = teclado.nextInt();
                System.out.println("Indique o dia do pagamento.");
                int dataP = teclado.nextInt();

                double valorP;
                do {
                    System.out.println("Indique o valor da prestação.");
                    valorP = teclado.nextDouble();
                    teclado.nextLine();
                    if (valorP <= 0.0) {
                        System.out.println("Valor de prestação inválido. Digite novamente.");
                    }
                } while (valorP <= 0.0);

                double valorPF;
                if (dataV - dataP >= 0) {
                    valorPF = valorP - valorP * 10.0 / 100.0;
                    somaD += valorP * 10.0 / 100.0;
                } else if (dataP - dataV <= 5) {
                    valorPF = valorP;
                } else {
                    valorPF = valorP + 2.0 * valorP / 100.0 * (double) (dataP - dataV);
                    double multa = 2.0 * valorP / 100.0 * (double) (dataP - dataV);
                    if (multa > maiorM) {
                        maiorM = multa;
                        nomeM = nomeC;
                    }
                    ++cont;
                    somaM += multa;
                }

                somaT += valorPF;
                System.out.println("NOME: " + nomeC);
                System.out.printf("VALOR A SER PAGO: R$%1.2f\n", valorPF);
            } while (!nomeC.equalsIgnoreCase("X"));

            double diferenca = somaD - somaM;
            double media = somaT / (double) cont;
            double mod;
            if (diferenca < 0.0) {
                mod = diferenca * -1.0;
            } else {
                mod = diferenca;
            }

            System.out.printf("A diferença entre o valor dos descontos e das multas é: R$%1.2f \nA média dos valores pagos pelos clientes é: R$%1.2f\n", mod, media);
            System.out.println("Cliente que pagou a maior multa: " + nomeM);
            teclado.close();
        }
    }
}

