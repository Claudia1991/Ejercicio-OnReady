import java.text.DecimalFormat;

public class Moto extends Vehiculo{
    private String cilindrada;
    DecimalFormat formato = new DecimalFormat("###,###.00");

    public Moto(String cilindrada, String marca, double precio, String modelo) {
        super(marca, precio, modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca:" +this.getMarca()+ " // Modelo:"+this.getModelo()+" // Cilindradas:"+cilindrada+" // Precio: $ "+formato.format(this.getPrecio());
    }
}