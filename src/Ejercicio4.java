public class Ejercicio4 {
    public static void main(String[] args) {
        calcularImpuestoYDescuento(99.99, 21, 15);
    }
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
