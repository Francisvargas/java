package ejercicios03;
public class MenuSwitch {
    public static void main(String[] args) {
        /*
         * Programa que me muestra un menu de calculo de areas
         */

        System.out.println("CÁLCULO DE ÁREAS");
        System.out.println("----------------");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectángulo");
        System.out.println("3.- Triángulo");
        System.out.print("\nElija una opción (1-3): ");

        int opcion = Integer.parseInt(System.console().readLine());

        double lado, base, altura;

        switch (opcion) {
            case 1:
                System.out.println("\nIntroduzca el lado del cuadrado: ");
                lado = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl área del cuadrado es " + (lado * lado) + " u2");
                break;
            case 2:
                System.out.println("\nIntroduzca el base del rectángulo: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.println("\nIntroduzca el altura del rectángulo: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl área del rectágulo es " + (base * altura) + " u2");
                break;
            case 3:
                System.out.println("\nIntroduzca el base del triángulo: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.println("\nIntroduzca el altura del triángulo: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl área del triángulo es " + (base * altura) / 2 + " u2");
                break;
            default:
                System.out.println("\nla opción no es correcta: ");
                break;
        }
    }
}
          

          
                
              
    
    

    
    
    
    
    

