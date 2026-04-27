/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 

1 litro para cada 3 metros quadrados e que a 
tinta é vendida em latas de 18 litros, que custam R$ 80,00. 

Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
*/

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da área que será pintada(m²): ");
        var areaPintada = scanner.nextInt();
        var valorLata = 80;
        double litrosNecessarios = areaPintada / 3.0;
        var latasNecessarias = (int) Math.ceil(litrosNecessarios / 18);
        double precoTotal = latasNecessarias * valorLata;
        System.out.printf("Você precisa comprar %d latas de tinta \n Preço total: %.2f", latasNecessarias, precoTotal);
        scanner.close();
    }
}
