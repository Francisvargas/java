package ArrayBi06;

public class Ejercicio1 {
    public static void main(String[] args) {
  /*
         * Realiza un programa que muestre en pantalla un array de 10 filas por
         * 10 columnas rellenas con números aleatorios entre 200 y 300. A
         * continuacion el programa debe mostrar los numeros de la diagonal que va desde
         * la esquina superior izquierda a la esquina inferior derecha, así
         * como el máximo, el mínimo y la media de los números que hay en la
         *diagonales.
         */
        // 1. Declaramos nuestro array bidimencional
        int [][] matriz = nuevo  int [ 10 ][ 10 ];
        int [] diagonal = nuevo  int [ 10 ];
        // 2. rellenar con números aleatorios
        for ( int  filas = 0 ; filas < 10 ; filas ++) {
            for ( int  columnas = 0 ; columnas < 10 ; columnas ++) {
                matriz [ filas ][ columnas ] = ( int ) ( Math . random () * 101 ) + 200 ;
                //Determinando los elementos de la diagonal
                if ( filas == columnas ) {
                    diagonal [ filas ] = matriz [ filas ][ columnas ];
                }
                Sistema . afuera . printf ( "%5d" , matriz [ filas ][ columnas ]);
            }
            Sistema . afuera . imprimir ();
        }
        int  mayor = 200 ;
        int  menor = 300 ;
        int  suma = 0 ;
        Sistema . afuera . println ( "Diagonal principal" );
        for ( int  i = 0 ; i < diagonal . longitud ; i ++) {
            Sistema . afuera . printf ( "%5d" , diagonal [ i ]);
            si ( diagonal [ i ]> mayor ) {
                mayor = diagonal [ i ];
            }
            si ( diagonal [ i ] < menor ) {
                menor = diagonal [ i ];
            }
            suma = suma + diagonal [ i ];
        }
        Sistema . afuera . println ( " \nAlcalde :" + alcalde );
        Sistema . afuera . println ( "Menor: " + menor );
        Sistema . afuera . println ( "Promedio: " +(( doble ) suma / 10 ));

    }
}

