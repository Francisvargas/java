public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
          System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
      }
    
    }
    

