package etapa3;

//Autor: Bernardo Buhr Alves Mendonça
//Função: sistema de cadastramento e atualização de endereço de moradia de determinado cpf

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        String CPF, ENDERECO;
        List<String> cpf = new ArrayList<String>();
        List<String> endereco = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Indique um CPF. (utilize apenas números)");
            CPF = teclado.nextLine();
            if (CPF.equalsIgnoreCase("0"))
            {
                break;
            }
            cpf.add(CPF);
            System.out.println("Indique o endereço correspondente ao CPF.");
            ENDERECO = teclado.nextLine();
            endereco.add(ENDERECO);
        }while(!CPF.equalsIgnoreCase("0"));
        System.out.println("Indique um CPF para ser pesquisado.");
        CPF = teclado.nextLine();
        for(int aux=0; aux<cpf.size(); aux++){
            if (CPF.equalsIgnoreCase(cpf.get(aux))){
                System.out.println("CPF encontrado!");
                System.out.println("Digite 1 para redefinir o endereço.");
                System.out.println("Digite 2 para apagar o cadastro deste CPF/endereço.");
                System.out.println("Digite 3 caso queira manter os dados desta forma.");
                int digito = teclado.nextInt();
                switch (digito){
                    case 1:
                        System.out.println("Digite o novo endereço.");
                        String nEn = teclado.nextLine();
                        endereco.set(aux,nEn);
                        break;
                    case 2:
                        endereco.remove(aux);
                        cpf.remove(aux);
                        System.out.println("Cadastro removido.");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }else if (aux==cpf.size()-1){
                System.out.println("CPF não encontrado, deseja cadastrá-lo?");
                System.out.println("Se sim, digite 1.");
                System.out.println("Se não, digite 2.");
                int dig = teclado.nextInt();
                switch (dig){
                    case 1:
                        cpf.add(CPF);
                        System.out.println("CPF cadastrado, indique o endereço");
                        String endN = teclado.nextLine();
                        endereco.add(endN);
                        System.out.println("Endereço cadastrado.");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        }
        for (int aux=0; aux<cpf.size(); aux++){
            System.out.println("CPF: " + cpf.get(aux));
            System.out.println("Endereço: " + endereco.get(aux));
            System.out.println();
        }
        teclado.close();
    }
}
