package ejercicios03.Sentencias;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dia;
String nombreDia;
System.out.println("  introduzca un numero de dia entre 1al 7");
dia= Integer.parseInt(System.console().readLine());
switch (dia) {
case 1:
nombreDia ="DOMINGO";
break;
case 2:
nombreDia ="lunes";
break;
case 3:
nombreDia ="martes";
break;
case 4:
nombreDia ="miercoles";
break;
case 5:
nombreDia ="jueves";
break;
case 6:
nombreDia ="viernes";
break;
case 7:
nombreDia ="sabado";
break;
default:
nombreDia = "no existe el dia";
}
System.out.println("el dia es "+nombreDia);
}

        
    }

  