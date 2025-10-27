public class Ejercicio2 {
    public static void main(String[] args) {
    // llamamos a la función indicando tres duraciones de canciones en segundos sin imprimir el resultado
        duracionMediaCanciones(192, 180, 195);
    }
    // creamos una función que sume la duración de tres canciones
    static double duracionMediaCanciones(int cancion1, int cancion2, int cancion3){
        return cancion1+cancion2+cancion3;
    }
}
