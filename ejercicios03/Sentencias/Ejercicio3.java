package ejercicios03.Sentencias;

public class Ejercicio3 {
    public static void main(String[] args) {
        int x = 0;
/* Recibe primera variable */
System.out.print(" introduce una variable: ");
int var1 = Integer.parseInt(System.console().readLine());
/* Recibe segunda variable */
System.out.print(" introduce otra variable: ");
int var2 = Integer.parseInt(System.console().readLine());
/* Calcula incógnita y la muestra en pantalla */
x = (-var2)/var1;
System.out.printf("En %dx + %d = 0, x = %d", var1, var2,
x);
}

    }
    

