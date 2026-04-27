import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade (em Kg) de morangos e maçãs que desejas: ");
        double kgMorango = scanner.nextDouble();
        double kgMaca = scanner.nextDouble();
        double precoMorango;
        double precoMaca;
        double valorCompra;
        if(kgMorango <= 5) precoMorango = kgMorango * 2.50;
        else precoMorango = kgMorango * 2.20;
        
        if(kgMaca <= 5) precoMaca = kgMaca * 1.80;
        else precoMaca = kgMaca * 1.50;

        valorCompra = precoMorango + precoMaca;

        if (kgMorango + kgMaca >= 8 || valorCompra >= 25) {
            valorCompra *= 0.90;
        }
        System.out.printf("Valor total da Compra: %.2f", valorCompra);
        scanner.close();
    }
}
