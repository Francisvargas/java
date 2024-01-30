package ejercicios03;

public class leenumeros {
    
        public static void main(String[] args) {
            String linea;
    
        System.out.println("Ingresa un numero: ");
        linea = System.console().readLine();
        int NumeroUno = Integer.parseInt(linea);
    
        System.out.println("Ingresa otro numero: ");
        linea = System.console().readLine();
        int NumeroDos = Integer.parseInt(linea);
    
        int suma = NumeroUno + NumeroDos;
        System.out.println("La suma es: "+suma);
        }
    }
