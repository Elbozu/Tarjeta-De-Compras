public class Compra {
    private double precio;
    private String descripcion;

    public Compra(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion + ": $RD" + precio;
    }
}