package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: calcular a média dos números impares de 1000 à 2000
public class C08EX16 {
    public static void main(String[] args) {
        int soma=0, cont=0;
        double media;
        for (int aux=1000; aux<=2000; aux++){
            if (aux%2!=0){
                soma += aux;
                cont++;
            }
        }
        media = (float) (soma / cont);
        System.out.println("Média dos números impares = " + media);
    }
}
