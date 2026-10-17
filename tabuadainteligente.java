import java.util.Scanner;

public class tabuadainteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TABUADA INTELIGENTE ===");
        System.out.println("Digite 0 para sair a qualquer momento.\n");

        while (true) {
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            // Regra: se digitar 0, finaliza o programa
            if (numero == 0) {
                System.out.println("Programa finalizado. Até logo!");
                break;
            }

            // Regra: se for negativo, mostra erro e reinicia o laço
            if (numero < 0) {
                System.out.println("Número inválido. Por favor, digite um número maior que zero.\n");
                continue;
            }

            // Calcula e exibe a tabuada de 1 a 10
            System.out.println("\n--- Tabuada do " + numero + " ---");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;

                // Verifica se o resultado é par ou ímpar usando o operador módulo (%)
                String paridade = (resultado % 2 == 0) ? "Par" : "Ímpar";

                System.out.println(numero + " x " + i + " = " + resultado + " (" + paridade + ")");
            }
            System.out.println();
        }

        scanner.close();
    }
}