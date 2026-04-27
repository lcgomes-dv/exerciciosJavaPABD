import java.util.Scanner;

public class ex11 {
    /*public static double calcularReajuste(double salarioIni){
        double salarioFinal;
        if (salarioIni >= 280) {    
            salarioFinal = salarioIni * (20/100);
        }
        return salarioFinal;
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salarioIni = scanner.nextDouble();
        double percentual;
        double salarioFinal;
        double aumento;
        if (salarioIni <= 280) percentual = 20;
        else if (salarioIni <= 700) percentual = 15;
        else if (salarioIni <= 1500) percentual = 10;
        else percentual = 5;
        aumento = salarioIni * percentual / 100;
        salarioFinal = salarioIni + aumento;
        System.out.printf("Salario Antes: %.2f\nPercentual Aplicado: %.2f\nValor do Aumento: %.2f\nNovo Salário: %.2f", salarioIni, percentual, aumento, salarioFinal);
    }
}
