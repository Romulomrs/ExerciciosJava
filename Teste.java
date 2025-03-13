import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in); // Criando Scanner

        /* Declaração das variáveis */
        int VALORP, PRECOP, TROCO;

        try {
            System.out.println("Valor que foi pago:");
            VALORP = entrada.nextInt(); // Lê o primeiro número
            System.out.println("Valor do produto:");
            PRECOP = entrada.nextInt(); // Lê o segundo número

           if (VALORP>PRECOP){
                TROCO=VALORP-PRECOP;
                System.out.println(String.format("Seu troco é: %d ", TROCO));
           }else if (PRECOP>VALORP){
                System.out.println("Valor insuficiente");
           }else{
                System.out.println("Sem troco");
           }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            entrada.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
    }
}
