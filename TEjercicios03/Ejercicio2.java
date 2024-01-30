package TEjercicios03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner  scanner = new Scanner(System.in);

       System.out.println("Ingrese la cantidad de euros a convertir: ");
       double euros = scanner.nextDouble();

       double tipoCambio = 4.10; 

       double soles = euros * tipoCambio;

       System.out.println(euros + " euros equivalen a " + soles + " soles peruanos.");

       scanner.close();
   }
}
       
