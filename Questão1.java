import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        int operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("7 - Raiz Cúbica");
        System.out.println("8 - Todas as operações");

        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 6:
                resultado = Math.sqrt(num1);
                System.out.println("Resultado: " + resultado);
                break;
            case 7:
                resultado = Math.cbrt(num1);
                System.out.println("Resultado: " + resultado);
                break;
            case 8:
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                resultado = Math.pow(num1, num2);
                System.out.println("Potenciação: " + resultado);
                resultado = Math.sqrt(num1);
                System.out.println("Raiz Quadrada: " + resultado);
                resultado = Math.cbrt(num1);
                System.out.println("Raiz Cúbica: " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}
