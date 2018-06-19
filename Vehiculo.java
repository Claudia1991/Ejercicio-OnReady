public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private double precio;
    private String modelo;

    public Vehiculo(String marca, double precio, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
    @Override
    public int compareTo(Vehiculo vehiculo){
        final int MAYOR = 1;
        final int IGUAL = 0;
        final int MENOR = -1;
        if(this.precio > vehiculo.precio){
            return MAYOR;
        }else if(this.precio == vehiculo.precio){
            return IGUAL;
        }else{
            return MENOR;
        }
    }
}