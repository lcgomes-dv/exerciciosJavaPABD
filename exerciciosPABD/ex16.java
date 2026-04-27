import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int quantidadePessoa = scanner.nextInt();

        while (quantidadePessoa <= 0) {
            System.out.println("Quantidade inválida! Deve ser maior que 0.");
            System.out.print("Informe a quantidade de pessoas: ");
            quantidadePessoa = scanner.nextInt();
        }

        int[] idades = new int[quantidadePessoa];
        int soma = 0;

        for (int i = 0; i < quantidadePessoa; i++) {
            do {
                System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
                
                while (!scanner.hasNextInt()) {
                    System.out.println("Digite apenas números!");
                    scanner.nextLine();
                }
                
                idades[i] = scanner.nextInt();

                if (idades[i] >= 0 && idades[i] <= 150) {
                    break;
                }
                System.out.println("Idade inválida! Digite entre 0 e 150 anos.");
            } while (true);

            soma += idades[i];
        }

        double media = (double) soma / quantidadePessoa;

        String classificacao;
        if (media <= 25) {
            classificacao = "jovem";
        } else if (media <= 60) {
            classificacao = "adulto";
        } else {
            classificacao = "idoso";
        }

        System.out.printf("\nMédia de idade do grupo: %.2f anos\n", media);
        System.out.println("Classificação do grupo: " + classificacao.toUpperCase());
        
        scanner.close();
    }
}
