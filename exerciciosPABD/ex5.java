public static void main (String[]args){
    System.out.println("Informe dois números inteiros e um real: ");
    var scanner = new Scanner(System.in);
    var numInt1 = scanner.nextInt();
    var numInt2 = scanner.nextInt();
    var numReal = scanner.nextDouble();
    var resultadoA = (numInt1 * 2) * (numInt2 / 2);
    var resultadoB = (numInt1 * 3) + numReal;
    var resultadoC = Math.pow(numReal, 3);
    System.out.printf("O produto do dobro do primeiro com metade do segundo é: %d\n", resultadoA);
    System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f\n", resultadoB);
    System.out.printf("O terceiro elevado ao cubo é: %.2f\n", resultadoC);
    scanner.close();
}
