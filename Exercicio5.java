import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Float Valor;
        
        System.out.println("Digite um número");
        Valor = numero.nextFloat();
        try{
        if(Valor%2 == 1 ){
            System.out.println("O número é ímpar");
        }else{
            System.out.println("O número é par");
        }
    }catch(Exception e){
        System.out.println("Ocorreu um erro: " + e.getMessage());
    }finally{
        numero.close();
    }
    }
}
