import java.util.Scanner;
public class ex7{
    public static String verificarPesoPeixe(double peso, int multa){
        if (peso > 50) {
            var pesoExcedente = peso - 50;
            var multaTotal = pesoExcedente * multa;
            return "O peso dos peixes ultrapassou os conformes, excedeu: " + pesoExcedente + "Kg. Sua multa será de: R$" + multaTotal;
        } else {
            return "Não haverá multa, peso dentro dos conformes.";
        }
    }
    
    public static void main (String[]args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe o peso dos peixes que trouxeres: ");
        var peso = scanner.nextDouble();
        var multa = 4;
        System.out.println(verificarPesoPeixe(peso, multa));
        scanner.close();
    }
}   
