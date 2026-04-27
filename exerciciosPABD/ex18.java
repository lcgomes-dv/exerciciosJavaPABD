import java.util.ArrayList;
import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.println("Para sair do loop, digite: -1");
            System.out.print("Informe um valor: ");
            double valor = scanner.nextDouble();

            if (valor == -1) {
                break;
            }

            notas.add(valor);
        }

        System.out.print("Quantidade de valores obtidos lidos: " + notas.size() + "\n");
        System.out.print("Valores Informados: " + notas  + "\n");

        System.out.println("Valores informados na ordem inversa: ");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (Double n : notas) {
            soma += n;
        }
        double media = notas.size() > 0 ? soma / notas.size() : 0;
        System.out.print("Média dos valores: " + media + "\n");

        int valoresAcima = 0;
        int valoresAbaixo = 0;

        for (double n : notas) {
            if (n > media) {
                valoresAcima++;
            } else if (n < media) {
                valoresAbaixo++;
            }
        }

        System.out.println("Quantidade acima da média: " + valoresAcima);
        System.out.println("Quantidade abaixo da média: " + valoresAbaixo);

        scanner.close();
        
    }
}
