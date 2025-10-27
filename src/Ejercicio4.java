public class Ejercicio4 {
    public static void main(String[] args) {
    // llamamos a la función indicando los datos requeridos para la impresión
        calcularImpuestoYDescuento(99.99, 21, 15);
    }
    // creamos una función void porque imprimirá la información sobre el producto en el formato indicada
    static void calcularImpuestoYDescuento(double precioInicial, int impuesto, int descuento){
        double precioConImpuesto= precioInicial+(precioInicial*impuesto)/100;
        System.out.println("Precio original: " + precioInicial + "€");
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("Con impuesto: " + precioConImpuesto + "€");
        System.out.println("Descuento: " + descuento + "%");
        double precioConDescuento= precioConImpuesto-(precioConImpuesto*descuento)/100;
        System.out.println("Con descuento: " + precioConDescuento + "€");
    }
}
