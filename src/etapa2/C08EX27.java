package etapa2;

//Autor: Bernardo Buhr Alves Mendonça
//Função: imprimir uma série de asteriscos
public class C08EX27 {
        public static void main(String[] args) {
            double ast;
            for (int aux4 = 1; aux4<=10; aux4++) {
                for (int aux2 = 1; aux2 <= 8; aux2++) {
                    ast = Math.pow(2,(aux2-1));
                    for (int aux = 1; aux <= ast; aux++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int aux2 = 7; aux2 >=1 ; aux2--) {
                    ast = Math.pow(2,(aux2-1));
                    for (int aux = 1 ; aux <= ast ; aux++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
