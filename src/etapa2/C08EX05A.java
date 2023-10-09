package etapa2;

import java.util.Scanner;
//Autor: Bernardo Buhr Alves Mendonça
//Função: indicar resultado de uma eleição com possibilidade de segundo turno
public class C08EX05A {
    public static void main(String[] args) {
        int voto, contF = 0, contC = 0, contB = 0, cont = 0, cont2 = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 100; aux++) {
            System.out.println("Indique o número de seu candidato");
            voto = teclado.nextInt();
            if (voto != 1 && voto != 2 && voto != 3) {
                cont++;
            } else {
                if (voto == 1) {
                    contF++;
                } else {
                    if (voto == 2) {
                        contC++;
                    } else {
                        contB++;
                    }
                }
            }
            if (cont > contB + contC + contF) {
                System.out.println("A eleição será anulada.");
                break;
            } else {
                System.out.println("Fulano: " + contF + " votos");
                System.out.println("Ciclano: " + contC + " votos");
                System.out.println("Beltrano: " + contB + " votos");
                if (contF > contC && contF > contB) {
                    System.out.println("O candidato Fulano foi eleito com " + contF + " votos.");
                } else {
                    if (contC > contF && contC > contB) {
                        System.out.println("O candidato Ciclano foi eleito com " + contC + " votos.");
                    } else {
                        if (contB > contF && contB > contC) {
                            System.out.println("O candidato Beltrano foi eleito com " + contB + " votos.");
                        } else {
                            System.out.println("Holve um empate. Haverá segundo turno.");
                            if (contF == contC) {
                                for (int aux2 = 1; aux2 <= 100; aux2++) {
                                    System.out.println("Indique o número de seu candidato");
                                    voto = teclado.nextInt();
                                    if (voto != 1 && voto != 2) {
                                        cont2++;
                                    } else {
                                        if (voto == 1) {
                                            contF++;
                                        } else {
                                            contC++;
                                        }
                                    }
                                }
                                if (cont2>contF&&cont2>contC){
                                    System.out.println("A maior parte dos votos foi anulada. a votação será anulada.");
                                }else {
                                    if (contF>contC){
                                        System.out.println("O candidato Fulano foi eleito com " + contF + " votos.");
                                    }else{
                                        System.out.println("O candidato Ciclano foi eleito com " + contC + " votos.");
                                    }
                                }
                            } else {
                                if (contF == contB) {
                                    for (int aux2 = 1; aux2 <= 100; aux2++) {
                                        System.out.println("Indique o número de seu candidato");
                                        voto = teclado.nextInt();
                                        if (voto != 1 && voto != 3) {
                                            cont2++;
                                        } else {
                                            if (voto == 1) {
                                                contF++;
                                            } else {
                                                contB++;
                                            }
                                        }
                                    }
                                    if (cont2>contF&&cont2>contB){
                                        System.out.println("A maior parte dos votos foi anulada. a votação será anulada.");
                                    }else {
                                        if (contF > contB) {
                                            System.out.println("O candidato Fulano foi eleito com " + contF + " votos.");
                                        } else {
                                            System.out.println("O candidato Beltrano foi eleito com " + contB + " votos.");
                                        }
                                    }
                                } else {
                                    for (int aux2 = 1; aux2 <= 100; aux2++) {
                                        System.out.println("Indique o número de seu candidato");
                                        voto = teclado.nextInt();
                                        if (voto != 3 && voto != 2) {
                                            cont2++;
                                        } else {
                                            if (voto == 3) {
                                                contB++;
                                            } else {
                                                contC++;
                                            }
                                        }
                                    }
                                    if (cont2>contC&&cont2>contB){
                                        System.out.println("A maior parte dos votos foi anulada. a votação será anulada.");
                                    }else {
                                        if (contC > contB) {
                                            System.out.println("O candidato Ciclano foi eleito com " + contC + " votos.");
                                        } else {
                                            System.out.println("O candidato Beltrano foi eleito com " + contB + " votos.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}