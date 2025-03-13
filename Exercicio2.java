import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in); // Criando Scanner

        /* Declaração das variáveis */
        Double VALORKG, QUANTIDADEKG, VALOR;

        try {
            System.out.println("PREÇO KG:");
            VALORKG = entrada.nextDouble(); // Lê o primeiro número
            System.out.println("KILOS:");
            QUANTIDADEKG = entrada.nextDouble(); // Lê o segundo número
            
            VALOR = QUANTIDADEKG*VALORKG;
            System.out.println(String.format("Total: %f", VALOR));
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            entrada.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
    }
}
