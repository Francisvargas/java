package TEjercicios03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        double salario = horasTrabajadas * 12;

        System.out.println("El salario semanal del empleado es: " + salario + " soles");
    }
}
