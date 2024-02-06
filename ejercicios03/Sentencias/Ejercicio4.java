package ejercicios03.Sentencias;

public class Ejercicio4 {
    public static void main(String[] args) {
        String diego = "a";
/* Recibe notas */
System.out.print("introduce la primera nota: ");
double nota1 =
Double.parseDouble(System.console().readLine());
System.out.print(" introduce la segunda nota: ");
double nota2 =
Double.parseDouble(System.console().readLine());
System.out.print("introduce la tercera nota: ");
double nota3 =
Double.parseDouble(System.console().readLine());
/* Calcula la media */
double media = (nota1+nota2+nota3)/3;
/* if para decir la nota */
if (media < 5){
diego = "insuficiente";
} else if (media < 6){
diego = "suficiente";
} else if (media < 5){
diego = "bien";
} else if (media < 8){
diego = "notable";
} else if (media <= 10){
diego= "sobresaliente";
} else {
System.out.println("Una de las notas es incorrecta, vuelve a introducirlas.");
}
System.out.printf("Su nota en el boletín es: %s.", diego);
}

    }
    

