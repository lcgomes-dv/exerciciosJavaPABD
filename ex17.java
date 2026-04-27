import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalPedido = 0.0;
        int codigo;
        int quantidade;

        System.out.println("Digite 0 no código para encerrar o pedido.\n");
        do {
            System.out.print("Informe o código do produto: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido! Digite um código entre 100 e 105.\n");
                continue;
            }

            System.out.print("Informe a quantidade: ");
            quantidade = scanner.nextInt();

            double valorItem = 0.0;
            String nomeProduto = "";

            switch (codigo) {
                case 100:
                    valorItem = quantidade * 1.20;
                    nomeProduto = "Cachorro-quente";
                    break;
                case 101:
                    valorItem = quantidade * 1.30;
                    nomeProduto = "Bauru simples";
                    break;
                case 102:
                    valorItem = quantidade * 1.50;
                    nomeProduto = "Bauru com ovo";
                    break;
                case 103:
                    valorItem = quantidade * 1.20;
                    nomeProduto = "Hambúrguer";
                    break;
                case 104:
                    valorItem = quantidade * 1.30;
                    nomeProduto = "Cheeseburguer";
                    break;
                case 105:
                    valorItem = quantidade * 1.00;
                    nomeProduto = "Refrigerante";
                    break;
                default:
                    continue;
            }

            System.out.printf("%d x %s = R$ %.2f%n", quantidade, nomeProduto, valorItem);
            totalPedido += valorItem;
        } while (true); 

        System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);
        scanner.close();
    }
}