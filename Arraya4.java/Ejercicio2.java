package Arraya4.java;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Realice un programa que genere 8 numeros enteros aleatorios y que luego muestre esos 
        // a la palabra par o impar segun corresponda 
        int[] numeros = new int[8];
          
        for (int i = 0; i <  numeros.length; i++){ 
        numeros[i] = ( int)(Math.random()*51);
        System.out.println(numeros[i]);
         }
         for (int i = 0; i < numeros.length; i++) { 
            if (numeros[i]% 2 == 0) {
                System.out.println(numeros[i] + "par");
                
            } else { 
                System.out.println(numeros[i]+ "impar");
                 }
                 
    }
    
}
