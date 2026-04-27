import java.util.Scanner;

public class ex15{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Informe seu nome: ");
            String nome = scanner.nextLine();
            int tamanhoNome = nome.length();
            if (tamanhoNome > 3) {
                break;
            }
            System.out.println("Por favor, insira um nome válido maior que 3 caracteres");
        } while (true);

        do {
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            }
            System.out.println("Por favor, insira uma idade válida entre 0 e 150 anos");
        } while (true);

        do {
            System.out.println("Informe seu salário: ");
            double salario = scanner.nextDouble();
            if (salario > 0) {
                break;
            }
            System.out.println("Por favor, insira um salário válido maior que 0");
        } while (true);

        do {
            System.out.println("Informe seu sexo(F/M): ");
            String sexo = scanner.nextLine();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                break;
            }
            System.out.println("Por favor, insira apenas (F/M)");
        } while (true);

        do {
            System.out.println("Informe seu Estado Civil(S/C/V/D): ");
            String estadoCivil = scanner.nextLine();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                break;
            }
            System.out.println("Por favor, insira apenas (S/C/V/D)");
        } while (true);
        scanner.close();
    }
}
