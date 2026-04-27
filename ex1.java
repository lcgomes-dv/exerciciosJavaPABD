// Faça um programa que peça as 4 notas bimestrais de um estudante e mostre a média aritmética entre elas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe as suas 4 notas bimestrais:");
        var n1 = scanner.nextInt();
        var n2 = scanner.nextInt();
        var n3 = scanner.nextInt();
        var n4 = scanner.nextInt();
        var media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("A sua média anual é: %d", media);
        scanner.close();
    }
}
