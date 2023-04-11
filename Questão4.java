import java.util.Scanner;

public class CalculadoraRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            double raizCubica = Math.cbrt(numero);
            System.out.printf("A raiz cúbica de %d é %.2f\n", numero, raizCubica);
        } else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de %d é %.2f\n", numero, raizQuadrada);
        }

        scanner.close();
    }
}
