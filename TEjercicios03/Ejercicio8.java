package TEjercicios03;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de megabytes (Mb): ");
        double megabytes = scanner.nextDouble();

        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + " megabytes equivale a " + kilobytes + " kilobytes")
    }
}
