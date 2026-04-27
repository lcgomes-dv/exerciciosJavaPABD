import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora e qual o número de horas que você trabalha por mês?");
        var ganhoHora = scanner.nextDouble();
        var horasMes = scanner.nextInt();
        var salarioMes = ganhoHora * horasMes;
        var impostoRenda = salarioMes * 0.11;
        var inss = salarioMes * 0.08;
        var sindicato = salarioMes * 0.05;
        var salarioLiquido = salarioMes - impostoRenda - inss - sindicato;
        System.out.printf("Seu salario bruto: R$%.2f \n Você pagou no INSS: R$%.2f \n você pagou no sindicato: R$%.2f \n Seu salário Líquido: %.2f",
        salarioMes, inss, sindicato, salarioLiquido);
        scanner.close();
    }
}
