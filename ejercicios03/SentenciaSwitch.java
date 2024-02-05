package ejercicios03;

import javax.swing.SwingConstants;

public class SentenciaSwitch {
    public static void main(String[] args) {
        int dia;
        String nombreDia;
        System.out.println("por favor ,introduzca un numero de dia entre 1 al 7:");
        dia = Integer.parseInt(System.console().readLine());
        switch (dia) {
            case 1:
            nombreDia = "DOMINGO";
                
                break;
        
            case 2:
            nombreDia = "LUNES";
                break;
                
                    case 3:
                    nombreDia = "MARTES";

                        break;
                
                case 4:
                nombreDia = "MIERCOLES";
                
                       break; 
                
                    case 5:
                    nombreDia = "JUEVES";

                        break;
                          
                case 6:
                nombreDia = "VIERNES";
                
                       break; 
                
                    case 7:
                    nombreDia = "SABADO";
                    
                        break;

                 default:
                        nombreDia = "NO EXISTE ESE DIA";
                        break;
                }
                System.out.println("DIA"+nombreDia);
        }


    }
    

