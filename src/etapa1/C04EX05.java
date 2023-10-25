package etapa1;
//Função: emitir ficha funcional formatada
//Autor: Bernardo Buhr Alves Mendonça
import javax.swing.JOptionPane;
import java.util.Scanner;

public class C04EX05 {
    public static void main(String[] args) {
        String nome, CPF, RG, salario, empresa, tEleitor, cartMOt;
        Scanner arquivo = new Scanner(C04EX05.class.getResourceAsStream("C04EX05_2"));
            nome = arquivo.nextLine();
            CPF = arquivo.nextLine();
            RG = arquivo.nextLine();
            tEleitor = arquivo.nextLine();
            cartMOt = arquivo.nextLine();
            empresa = arquivo.nextLine();
            salario = arquivo.nextLine();

        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE: " + nome +
                        "\nDocumentos:" +
                        "\nCPF ...........................    " + CPF +
                        "\nC.I. ..........................    " + RG +
                        "\nTítulo de eleitor .............    " + tEleitor +
                        "\nCarteira de motorista .........    " + cartMOt +
                        "\n" +
                        "\nEmpresa: " + empresa +
                        "\nSalário: " + salario,
                "FICHAFUNCIONAL",
                JOptionPane.INFORMATION_MESSAGE);



    }
}








