package etapa2;

//Aluno: Bernardo Buhr Alves Mendonça
//Função: determinar quais números de 1000 a 9999 pussuem determinada propriedade, imprimi-los e fazer a média destes

public class D22698B {
    public static void main(String[] args) {
        int termo, soma = 0, cont = 0;
        double quadrado, media;
        for (int aux = 1000; aux < 9999; aux++) {
            termo = aux / 100 + aux % 100;
            quadrado = Math.pow(termo, 2.0);
            if (quadrado == aux) {
                soma += aux;
                cont++;
                System.out.println("O número " + aux + " possui a propriedade.");
            }
        }
        media = (float) soma / cont;
        System.out.println("Média dos valores: " + media);
    }
}
