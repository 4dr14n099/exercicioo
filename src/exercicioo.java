import java.util.Scanner;

public class exercicioo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float base;
        float alt;
        float area;

        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        alt = scanner.nextFloat();

        area = base * alt;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}