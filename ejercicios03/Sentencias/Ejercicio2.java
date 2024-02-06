package ejercicios03.Sentencias;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int solesHora = 12;
final int eurosExtra = 16;
int totalSueldo;
int horasExtra;
/* Recibe horas trabajadas */
System.out.print(" introduce las horas trabajadas: ");
int horasTrabajadas =
Integer.parseInt(System.console().readLine());
/* Calcula si hay horas extra */
if (horasTrabajadas <= 40){
totalSueldo = horasTrabajadas*solesHora;
System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d soles", horasTrabajadas, totalSueldo);
}
else if (horasTrabajadas > 40){
horasExtra = horasTrabajadas - 40;
totalSueldo = 40*solesHora + horasExtra*eurosExtra;
System.out.printf("El sueldo correspondiente a %d hora de trabajo, son %d doles", horasTrabajadas, totalSueldo);
}
}
    }
    

