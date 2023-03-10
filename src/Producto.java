public class Producto {

    private String prod;
    private double precio;

    public Producto (String prod, double precio) {
        this.prod = prod;
        this.precio = precio;
    }

    public String getProd () {
        return prod;
    }

    public double getPrecio() {
        return precio;
    }
}
