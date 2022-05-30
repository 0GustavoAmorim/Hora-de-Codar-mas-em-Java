import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){
        Double lado, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o um lado do seu quadrado: ");
        lado = in.nextDouble();

        area = lado * lado;
        System.out.println("A area do seu quadrado é: "+area+"cm²");
    }
}