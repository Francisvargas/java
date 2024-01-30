package TEjercicios03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
    }
}
