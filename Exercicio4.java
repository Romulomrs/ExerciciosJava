import java.util.Scanner;

public class Exercicio4 {

    public static void main(String args[]) {
        Scanner valor = new Scanner(System.in);
        Double Valor1, Valor2,Valor3,Valor4;

        try {
            System.out.println("Digite o primeiro valor");
            Valor1 = valor.nextDouble();

            System.out.println("Digite o segundo valor");
            Valor2 = valor.nextDouble();

            System.out.println("Digite o terceiro valor");
            Valor3 = valor.nextDouble();

            System.out.println("Digite o quarto valor");
            Valor4 = valor.nextDouble();

            // Comparando os valores
            Double menorValor = Math.min(Math.min(Valor1,Valor2),Math.min(Valor3, Valor4));
            System.out.println("O menor valor é: " + menorValor);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            valor.close();
        }
    }
}

