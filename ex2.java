//Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;


public class App {
    public static double calcularAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    
    
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o raio do círculo para saber a sua área:");
        var raio = scanner.nextDouble();
        var area = calcularAreaCirculo(raio);
        System.out.printf("A área do círculo é: %.2f%n", area);
        scanner.close();
    }
}
