import java.util.Scanner;

public class Nome{
    public static void main(String[] args){
        String nome;
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = in.next();

        System.out.println("\n\tOlá  " +nome);


        
    }
}