package ejercicios03;

public class Switchhorarario {
    public static void main(String[] args) {
    
        String diaSem;
  
        System.out.print("Por favor, introduce un dia de la semana: ");
        diaSem = System.console().readLine().toLowerCase();

        switch (diaSem){
            case "lunes":
            case "miércoles":
              System.out.print("Hay calculo 1.");
              break;
            case "martes":
            case "jueves":
            case "viernes":
              System.out.print("Hay Programación.");
              break;
            case "sábado":
            case "domingo":
              System.out.print("No hay clase.");
            default:
              System.out.print("¿Qué parte de dia de la semana no entendiste?");
        }
      }
    }

