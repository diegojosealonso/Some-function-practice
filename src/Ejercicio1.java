public class Ejercicio1 {
    public static void main(String[] args) {
    // llamamos a la función indicando unos datos concretos sobre un libro
        mostrarLibro("Moby Dick", "Herman Melville", 823);
    }
    //creamos la función que imprima los datos del libro
    static void mostrarLibro(String title, String author, int pages) {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
