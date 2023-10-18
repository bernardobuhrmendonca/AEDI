package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: determinar o faturamento de um empresa ao fim de um mês no qual foram vendidas 1000 máquinas
public class C08EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma=0;
        int codigo;
        for (int aux = 1; aux<=1000; aux++){
            do {
                System.out.println("Indique o código do produto.");
                codigo = teclado.nextInt();
                if (codigo<1||codigo>5){
                System.out.println("Código inválido, digite novamente.");
                }
            }while(codigo<1||codigo>5);
            if (codigo == 1){
                soma += 1565.0;
            }else{
                if (codigo == 2){
                    soma += 1890.0;
                }else{
                    if (codigo == 3){
                        soma+=2150.0;
                    }else{
                        if (codigo == 4){
                            soma += 2963.0;
                        }else{
                            soma+= 3750.0;
                        }
                    }
                }
            }
        }
        System.out.printf("O faturamento total do período foi: R$%1.2f", soma);
        teclado.close();
    }
}
