import java.util.Scanner;

public class exercicioo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float b;
        float alt;
        float a;

        System.out.println("Informe a base do retangulo: ");
        b = scanner.nextFloat();

        System.out.println("Informe a altura do retangulo: ");
        alt = scanner.nextFloat();

        a = b * alt;

        System.out.println("A área do retângulo é: " + a);

        scanner.close();
    }
}