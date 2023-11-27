package etapa3;

public class C14EX02A {
    public static double quadrado(double lado){
        double area = Math.pow(lado,2);
        return area;
    }
    public static double retangulo(double base, double altura){
        double area = base * altura;
        return area;
    }
    public static double triangulo(double base, double altura){
        double area = base * altura / 2;
        return area;
    }
    public static double circulo(double raio){
        double area = Math.PI * Math.pow(raio,2);
        return area;
    }
}
