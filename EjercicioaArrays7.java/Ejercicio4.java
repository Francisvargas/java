package EjercicioaArrays7.java;

public class Ejercicio {
    public static void main(String[] args) {
        int[] num; 
        num = new int[10];
    
        int max=0;
        int min=9999;
         
        
            
            System.out.println("Escribe 10 numeros: ");
            
            for(int i=0;i<10;i++){
                num[i]=Integer.parseInt( System.console().readLine() );
                
                if(num[i]>max){
                 
                    max = num[i];
                    
                }
                
                if(num[i]<min){
                
            min = num[i];				
                }
                
            }
            
            System.out.println("Los numeros son: ");
            
            for(int i=0;i<10;i++){
                System.out.println(num[i]);
                
                if(num[i]==max){
                    System.out.println(max+" maximo");
                }else if(num[i]==min){
                    System.out.println(min+" minimo");
                }			
            }		
        }
    
    }

