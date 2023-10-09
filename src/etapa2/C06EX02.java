package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: emitir a multa para um determinada quantidade de poluentes liberada
public class C06EX02 {
    public static void main(String[] args) {
        double multa,polu;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nível de poluentes emitido? ");
        polu = teclado.nextDouble();
        if(polu<=1500){
            multa = 0;
        }else{
            if(polu>1500&&polu<=3500){
                multa = 3000;
            }else{
                multa = 5000 * polu;
            }
        }
        System.out.println("Emissão: " + polu);
        System.out.println("Multa: " + multa);
        teclado.close();
    }
}
