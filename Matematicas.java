public class Matematicas {
    // Funcionn que retorne si un numero es capicua 
    public static boolean esCapicua(int n ) {
        System.out.println("Sinun numeo es capicua retorna");
        int original = n;
        int inverso = 0;

        while (n > 0) {
            int digito = n % 10;
            inverso = inverso * 10 + digito;
            n = n / 10;
            
        }
          return original == inverso;
    
    }

    

