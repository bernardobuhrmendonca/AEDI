package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir uma série
public class C08EX24 {
    public static void main(String[] args) {
        double serie=0;
        for (int aux=1; aux<=99; aux+=2){
            serie+= Math.pow(2,aux) / 3;
        }
        System.out.println("O valor da série é: " + serie);
    }
}
