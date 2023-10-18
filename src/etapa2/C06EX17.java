package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar se candidatos são aptos para vagas oferecidas
public class C06EX17 {
    public static void main(String[] args) {
        String ctProg, csProg, anosEx, cri, lid, tEq, auto, salario, local;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você tem curso técnico de programação? ");
        ctProg = teclado.nextLine();
        System.out.println("Você tem curso superior de programação? ");
        csProg = teclado.nextLine();
        System.out.println("Você tem menos de 3 anos de experiência em programação? ");
        anosEx = teclado.nextLine();
        System.out.println("Você se considera uma pessoa criativa? ");
        cri = teclado.nextLine();
        System.out.println("Você prefere liderar a ser liderado? ");
        lid = teclado.nextLine();
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        tEq = teclado.nextLine();
        System.out.println("Você é autodidata (aprende sozinho)? ");
        auto = teclado.nextLine();
        System.out.println("Você aceitaria uma remuneração inicial de R$1500? ");
        salario = teclado.nextLine();
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        local = teclado.nextLine();
        if (cri.equalsIgnoreCase("f")||cri.equalsIgnoreCase("falso")){
            System.out.println("Infelizmente o seu perfil profissional não se encaixa para a vaga.");
        }else{
            if (lid.equalsIgnoreCase("f")||lid.equalsIgnoreCase("falso")&&salario.equalsIgnoreCase("v")||salario.equalsIgnoreCase("verdadeiro")){
                System.out.println("Infelizmente o seu perfil profissional não se encaixa para a vaga.");
            }else{
                if (tEq.equalsIgnoreCase("v")||tEq.equalsIgnoreCase("Verdadeiro")){
                    System.out.println("Infelizmente o seu perfil profissional não se encaixa para a vaga.");
                }else{
                    if (auto.equalsIgnoreCase("f")||auto.equalsIgnoreCase("falso")){
                        System.out.println("Infelizmente o seu perfil profissional não se encaixa para a vaga.");
                    }else{
                        if (auto.equalsIgnoreCase("v")||auto.equalsIgnoreCase("verdadeiro")){
                            System.out.println("Infelizmente o seu perfil profissional não se encaixa para a vaga.");
                        }else{
                            System.out.println("O seu perfil profissional se encaixa no exigido para vaga.");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
