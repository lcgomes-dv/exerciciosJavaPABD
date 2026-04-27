public static void main (String[]args) {
    System.out.println("Informe sua altura: ");
    var scanner = new Scanner(System.in);
    var height = scanner.nextDouble();
    var idealWeight = 72.7 * height - 58;
    System.out.printf("O seu peso ideal é: %.2f", idealWeight);

}
