package TEjercicios03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 * numero2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

    }  
    }
        

