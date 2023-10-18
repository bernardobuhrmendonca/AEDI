package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir todos os números triangulares de 1 a 1000 e a média destes
public class C08EX28 {
    public static void main(String[] args) {
        int cont=0;
        double soma=0, media=0;
        for (int aux=1; aux<=1000; aux++){
            if (aux*(aux+1)*(aux+2)<=1000){
                cont++;
                System.out.println(aux*(aux+1)*(aux+2));
                soma += aux*(aux+1.0)*(aux+2);
            }
        }
        media = soma / cont;
        System.out.println("A média destes números é: " + media);

    }
}
