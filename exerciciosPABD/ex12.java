import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe suas duas notas parciais: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double mediaParcial = (n1 + n2) / 2;
        char conceito;
        String situacao;
        if (mediaParcial >= 9 && mediaParcial <= 10) {
            conceito = 'A';
            situacao = "Aprovado com Distinção";
        } else if(mediaParcial >= 7.5){
            conceito ='B';
            situacao = "Aprovado";
        } else if(mediaParcial >= 6){
            conceito ='C';
            situacao = "Aprovado";
        } else if(mediaParcial >= 4){
            conceito ='D';
            situacao = "Reprovado";
        } else{
            conceito = 'E';
            situacao = "Reprovado";
        }
        var c = conceito;
        var s = situacao;
        System.out.printf("Notas: %.2f e %.2f\nMédia: %.2f\nConceito: %c\nSituação: %s", n1, n2, mediaParcial, c, s);
    }
}
