public class Ejercicio3 {
    public static void main(String[] args) {
    tiempoRestanteAlquiler(20, 45);
    }
    static int tiempoRestanteAlquiler(int semanasTotales, int diasTranscurridos){
        int diasTotales = semanasTotales*7;
        int diasRestantes = diasTotales-diasTranscurridos;
        return diasRestantes;
    }
}
