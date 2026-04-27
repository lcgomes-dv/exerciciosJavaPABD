import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um IP (ou 'sair'): ");
            String ip = scanner.nextLine();

            if (ip.equalsIgnoreCase("sair")) {
                break;
            }

            if (validarIP(ip)) {
                System.out.println("IP válido\n");
            } else {
                System.out.println("IP inválido\n");
            }
        }

        scanner.close();
    }

    public static boolean validarIP(String ip) {

        ip = ip.trim();

        String[] partes = ip.split("\\.");

        if (partes.length != 4) {
            return false;
        }

        for (String parte : partes) {

            if (parte.isEmpty()) {
                return false;
            }

            if (!parte.matches("\\d+")) {
                return false;
            }

            int num = Integer.parseInt(parte);

            if (num < 0 || num > 255) {
                return false;
            }
        }

        return true;
    }
}
