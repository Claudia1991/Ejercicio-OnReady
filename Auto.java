import java.text.DecimalFormat;

public class Auto extends Vehiculo {
    private int puertas;
    DecimalFormat formato = new DecimalFormat("###,###.00");

    public Auto(int puertas, String marca, double precio, String modelo) {
        super(marca, precio, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca:" +this.getMarca()+ " // Modelo:"+this.getModelo()+" // Puertas:"+puertas+" // Precio: $"+formato.format(this.getPrecio());
    } 
}