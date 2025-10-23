public class Ejercicio1 {
    public static void main(String[] args) {
        mostrarLibro("Moby Dick", "Herman Melville", 823);
    }

    static void mostrarLibro(String title, String author, int pages) {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
