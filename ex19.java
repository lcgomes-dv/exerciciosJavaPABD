import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Atleta: ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isEmpty()) {
                break;
            }

            double[] saltos = new double[5];
            double soma = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + "º Salto: ");
                saltos[i] = scanner.nextDouble();
                soma += saltos[i];
            }

            double media = soma / 5;

            System.out.println("\nResultado:");
            System.out.println("Atleta: " + nomeAtleta);

            System.out.print("\nSaltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) {
                    System.out.print(" - ");
                }
            }
            System.out.println("\nMédia dos saltos: " + media + " metros\n");
        }

        scanner.close();
    }
}