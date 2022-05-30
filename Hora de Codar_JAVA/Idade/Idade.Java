import java.util.Scanner;

public class Idade{
    public static void main(String[] args){
        String nome;
        int idade = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = in.next();
        System.out.println("Qual sua idade?");
        idade = in.nextInt();

        System.out.println("\n\tOlá  " +nome+ " Sua idade é: " +idade);
    }
}