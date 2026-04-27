import java.util.Scanner;

public static void main (String[]args){
    System.out.print("Digite uma temperatura em Fehrenheit para descobrir seu valor em celsius: ");
    var scanner = new Scanner(System.in);
    var fehrenheit = scanner.nextDouble();
    var celsius = (fehrenheit - 32) * 5 / 9;
    System.out.printf("O valor de %.2f em graus celsius é: %.2f", fehrenheit, celsius);
}
