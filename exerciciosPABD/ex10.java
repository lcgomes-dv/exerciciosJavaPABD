import java.util.Scanner;

public class ex10 {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do seu arquivo para download(MB) \n e a velocidade da internet(Mbps): ");
        double tamArquivo = scanner.nextDouble();
        double velNet = scanner.nextDouble();
        double velNetMB = velNet / 8;
        double tempSeg = tamArquivo / velNetMB;
        double tempMin = tempSeg / 60;
        System.out.printf("O tamanho do seu arquivo: %.2f MB\n A velocidade da sua internet: %.2f Mbps\n O tempo que leverá para download: %.2f minutos", tamArquivo, velNet, tempMin);
        scanner.close();
    }
}
