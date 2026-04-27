import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma data (DD/MM/AAAA) ou 'sair': ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String resultado = formatarData(entrada);
            System.out.println(resultado);
        }

        scanner.close();
    }

    public static String formatarData(String data) {

        String[] partes = data.split("/");

        String dia = partes[0];
        int mes = Integer.parseInt(partes[1]);
        String ano = partes[2];

        String mesExtenso = "";

        switch (mes) {
            case 1: mesExtenso = "janeiro"; break;
            case 2: mesExtenso = "fevereiro"; break;
            case 3: mesExtenso = "março"; break;
            case 4: mesExtenso = "abril"; break;
            case 5: mesExtenso = "maio"; break;
            case 6: mesExtenso = "junho"; break;
            case 7: mesExtenso = "julho"; break;
            case 8: mesExtenso = "agosto"; break;
            case 9: mesExtenso = "setembro"; break;
            case 10: mesExtenso = "outubro"; break;
            case 11: mesExtenso = "novembro"; break;
            case 12: mesExtenso = "dezembro"; break;
        }

        return dia + " de " + mesExtenso + " de " + ano;
    }
}