package Tareas;

import java.util.Scanner;

public class MedirAritmetica {
     public static void main(String[] args) {
        int sum = 0, inputNum;
        int counter;
        float mean;
        
        Scanner NumScanner = new Scanner(System.in);
        
        System.out.println("Ingresa el número total de términos para calcular la media:");
        counter = NumScanner.nextInt();
        
        System.out.println("Por favor ingresa " + counter + " números:");
        for(int x = 1; x <= counter; x++) {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
        }
        
        mean = sum / counter;
        System.out.println("La media de los " + counter + " números que ingresaste es " + mean);
    }

}
