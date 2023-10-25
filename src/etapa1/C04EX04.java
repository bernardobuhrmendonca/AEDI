package etapa1;
//Autor: Bernardo Buhr Alves Mendonça
//Função: Imprimir dados pessoais de acordo com um modelo
import javax.swing.JOptionPane;

public class C04EX04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,
                "Qual o seu nome?",
                "NOME",
                JOptionPane.QUESTION_MESSAGE);
        String nomeMeio = JOptionPane.showInputDialog(null,
                "Qual o seu nome do meio?",
                "NOME DO MEIO",
                JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual o seu sobrenome?",
                "SOBRENOME",
                JOptionPane.QUESTION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null,
                "Qual a sua idade?",
                "IDADE",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                sobrenome + ", " + nome + " " + nomeMeio + "\n" + idade + " anos",
                "FORMATAÇÃO",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
