import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorSim = 0;
        System.out.print("Telefonou para a vítima? (s/n): ");
        if(scanner.next().equalsIgnoreCase("s")) contadorSim++;
        System.out.print("Esteve no local do crime? (s/n): ");
        if(scanner.next().toLowerCase().startsWith("s")) contadorSim++;
        System.out.print("Mora perto da vítima? (s/n): ");
        if(scanner.next().toLowerCase().startsWith("s")) contadorSim++;
        System.out.print("Devia para a vítima? (s/n): ");
        if(scanner.next().toLowerCase().startsWith("s")) contadorSim++;
        System.out.print("Já trabalhou com a vítima? (s/n): ");
        if(scanner.next().toLowerCase().startsWith("s")) contadorSim++;
        
        if (contadorSim == 2) System.out.print("Suspeita");
        else if (contadorSim == 3 || contadorSim == 4) System.out.print("Cúmplice");
        else if (contadorSim == 5) System.out.println("Assassino");
        else System.out.print("Inocente");
        scanner.close();
    }
}
