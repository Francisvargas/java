package Arraya4.java;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
     * Escribir un programa que llene un arraya de 100 elementos con numeros enteros aleatorios entre 0 y 500 
     * A continuacion el programa mostrara el arraya y preguntas al usuario si quiere destacar el maximo 
     * o minimo, seguidamente se volvera a mostrar el arraya escribiendo el numero destacad entre dobles asteriscos 
     * 
     * **1**
     * **480**
     * 
     */
    
     int[] array = new int[100];
        Scanner scanner = new Scanner(System.in);

        // Llenar el array con números enteros aleatorios entre 0 y 500
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 501);  // Genera un número aleatorio entre 0 y 500
        }

        // Mostrar el array
        System.out.println("Array original:");
        System.out.println(Arrays.toString(array));

        // Preguntar al usuario si quiere destacar el máximo o mínimo
        System.out.println("¿Quieres destacar el máximo o el mínimo? (max/min)");
        String opcion = scanner.next();

        // Encontrar el número a destacar
        int numeroDestacado;
        if (opcion.equals("max")) {
            numeroDestacado = Arrays.stream(array).max().getAsInt();
        } else {
            numeroDestacado = Arrays.stream(array).min().getAsInt();
        }

        // Mostrar el array con el número destacado entre dobles asteriscos
        for (int i = 0; i < 100; i++) {
            if (array[i] == numeroDestacado) {
                System.out.println("**" + array[i] + "**");
            } else {
                System.out.println(array[i]);
            }
        }
    }





    }
    

