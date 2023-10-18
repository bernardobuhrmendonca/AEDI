package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar a idade média dos grupos feminino e masculino q serão indicados pelo usuário
public class C08EX09 {
    public static void main(String[] args) {
        double idade=0, contH=0, contM=0, rep, idadeH, idadeM, sIdadeH=0, sIdadeM=0;
        String nome, sexo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a quantidade de repetições.");
        rep = teclado.nextDouble();
        for (int aux = 1; aux<=rep; aux++){
            System.out.println("Indique o seu nome.");
            nome = teclado.nextLine();
            System.out.println("Indique o seu sexo por M ou F.");
            sexo = teclado.nextLine();
            if (!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")){
                System.out.println("Informação inválida. O sistema será encerrado.");
                break;
            }
            if (sexo.equalsIgnoreCase("M")){
                sIdadeH+=idade;
                contH++;
            }else{
                sIdadeM+=idade;
                contM++;
                System.out.println("Nome: " + nome + "\nIdade: " + idade);
            }
        }
        idadeM = sIdadeM / contM;
        idadeH = sIdadeH / contH;
        System.out.println("Idade média (Homens): " +idadeH + "\nIdade média (Mulheres): " + idadeM);
        teclado.close();
    }
}
