package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir o quadrado dos 100 primeiros termos e a soma destes
public class C08EX19 {
    public static void main(String[] args) {
        double soma = 0;
        for (int aux=1; aux<=100; aux++){
            soma += Math.pow(aux,2.0);
            System.out.println(Math.pow(aux,2.0));
        }
        System.out.println("Soma dos 100 primeiros termos " + soma);
    }
}
