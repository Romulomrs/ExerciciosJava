import java.util.Scanner;

public class Exercicio3 {

    public static void main(String args[]) {
        Scanner valor = new Scanner(System.in);
        Double Valor1, Valor2;

        try {
            System.out.println("Digite o primeiro valor");
            Valor1 = valor.nextDouble();

            System.out.println("Digite o segundo valor");
            Valor2 = valor.nextDouble();

            // Comparando os valores
            if (Valor1 > Valor2) {
                System.out.println("O maior valor é: " + Valor1);  // Exibe exatamente o valor como foi inserido
            } else if (Valor2 > Valor1) {
                System.out.println("O maior valor é: " + Valor2);  // Exibe exatamente o valor como foi inserido
            } else {
                System.out.println("Valores iguais");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            valor.close();
        }
    }
}
