import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args){
        Double base, alt, area;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a Altura do seu retangulo: ");
        alt = in.nextDouble();
        System.out.println("Informe a base do seu retangulo: ");
        base = in.nextDouble();

        area = base*alt;

        System.out.println("A base do seu retangulo é: "+area);
    }
}