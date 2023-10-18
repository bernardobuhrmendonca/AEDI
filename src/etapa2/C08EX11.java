package etapa2;

import javax.swing.*;
//Nome: Bernardo Buhr Alves Mendonça
//Função: computar dados de características específicas e emitir o requerido
public class C08EX11 {
    public static void main(String[] args) {
        String nome$ = "", nome, salarioStr, idadeStr;
        String[] botoesS = {"Feminino", "Masculino"},
                botoesC = {"Loiro", "Moreno", "Ruivo", "Preto"},
                botoesE = {"Casado(a)", "Solteiro(a)", "Outro"},
                botoesEs = {"Analfabeto", "E.Fundamental", "E.Médio", "E.Superior"},
                botoesO = {"Castanho", "Azul", "Preto", "Outro"};
        int indice1, indice2, indice3, contA = 0, indice4, indice5;
        double salarioPM=Double.MAX_VALUE, salarioG = 0, salarioGM = 0, diferencaPG;
        for (int aux = 1; aux <= 5; aux++) {

            indice1 = JOptionPane.showOptionDialog(null,
                    "indique o seu sexo",
                    "Questionário",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesS,
                    "Feminino");

            nome = JOptionPane.showInputDialog(null,
                    "Indique o seu nome.",
                    "Questionário",
                    JOptionPane.QUESTION_MESSAGE);

            idadeStr = JOptionPane.showInputDialog(null,
                    "Indique sua idade.",
                    "Questionário",
                    JOptionPane.QUESTION_MESSAGE);
            double idade = Double.valueOf(idadeStr);

            indice5 = JOptionPane.showOptionDialog(null,
                    "Indique sua escolaridade.",
                    "Questionário",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesEs,
                    "Analfabeto");

            salarioStr = JOptionPane.showInputDialog(null,
                    "Indique o seu salário apenas com números.",
                    "Questionário",
                    JOptionPane.QUESTION_MESSAGE);
            double salario = Double.valueOf(salarioStr);

            indice2 = JOptionPane.showOptionDialog(null,
                    "Indique o seu estado civil.",
                    "Questionário",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesE,
                    "Solteiro(a)");

            indice3 = JOptionPane.showOptionDialog(null,
                    "Indique a cor do seu cabelo.",
                    "Questionário",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesC,
                    "moreno(a)");

            indice4 = JOptionPane.showOptionDialog(null,
                    "Indique a cor dos seus olhos.",
                    "Questionário",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesO,
                    "Castanho");

            if (salario >= 10000.0 && idade <= 25 && idade >= 18 && indice3 == 0 && indice4 == 1 && indice1 == 0 && indice2 == 1 && indice5 == 3) {
                contA++;
            }
            if (salario > salarioG) {
                salarioG = salario;
                nome$ = nome;
            }
            if (indice1 == 1) {
                if (salario > salarioGM) {
                    salarioGM = salario;
                }
                    if (salario < salarioPM) {
                        salarioPM = salario;
                    }
                }
            }
            diferencaPG = salarioGM - salarioPM;
            JOptionPane.showConfirmDialog(null,
                    "a) R: " + contA + "\nb) R: " + nome$ + "\nc) R: R$" + diferencaPG,
                    "Resultado",
                    JOptionPane.OK_CANCEL_OPTION);
        }
    }

