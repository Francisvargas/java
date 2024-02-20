public class Ejercicios4 {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota:");
        Scanner s = new Scanner(System.in);
        Double nota = s .nextDoble();

        if(nota >= 10.5) { 
            System.out.println(nota +"APROBADO");
        }else{ 
            System.out.println(nota +"DESAPROBADO");
        }
    }
}  

