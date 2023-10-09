package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir uma série de asteriscos em diagonal
public class C08EX26 {
    public static void main(String[] args) {
        for (int aux4 = 1; aux4<=10; aux4++) {
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                for (int aux = 1; aux <= aux2; aux++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int aux2 = 10; aux2 >=1 ; aux2--) {
                for (int aux = 1; aux <= aux2; aux++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
