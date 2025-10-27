public class Ejercicio3 {
    public static void main(String[] args) {
    // llamamos a la función indicando unas semanas totales y unos días trancurridos
        tiempoRestanteAlquiler(20, 45);
    }
    // creamos la función que convierta las semanas en días totales para restarles los transcurridos
    static int tiempoRestanteAlquiler(int semanasTotales, int diasTranscurridos){
        int diasTotales = semanasTotales*7;
        int diasRestantes = diasTotales-diasTranscurridos;
        return diasRestantes;
    }
}
