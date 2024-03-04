package py1.Arrayos7.java;

public class ejercicio3 {
    public static void main(String[] args) {
        //Arraglo de notas 
        double[] notas = new double[5];
        System.out.println("Ingrese la nota de la 1era parcial");

        for (int i = 0; i < notas.length; i++) { 
            System.out.println(" Nota del estudiante n "+(i+)+":");
            notas[i]= Double.parseDouble(System.console().readLine());
            suma = suma + notas [i];

        }
        System.out.println("El promedio del aula es:"+ suma / notas.length);
    }
    
}
