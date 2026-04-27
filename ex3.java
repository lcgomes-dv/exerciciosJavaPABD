/*
Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
no mês. Calcule e mostre o total do seu salário no referido mês.
*/
import java.util.Scanner;


public class App {

    public static double calcularSalarioMes(double valorHora, int horaMes){
        return valorHora * horaMes;
    }
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o valor que você recebe por hora: ");
        var valorHora = scanner.nextDouble();
        System.out.print("Informe o número de horas que você trabalhou esse mês: ");
        var horaMes = scanner.nextInt();
        var salarioMes = calcularSalarioMes(valorHora, horaMes);
        System.out.printf("O seu salário mensal desse mês foi: %.2f", salarioMes);
        scanner.close();
    }
}
