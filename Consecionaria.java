import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Consecionaria {
    private ArrayList<Vehiculo>listaVehiculos = new ArrayList();
    DecimalFormat formato = new DecimalFormat("###,###.00");
    
    public void cargarVehiculos(){
        listaVehiculos.add(new Auto(4, "Peugeot", 200000, "206"));
        listaVehiculos.add(new Moto("125c", "Honda", 60000 , "Titan"));
        listaVehiculos.add(new Auto(5, "Peugeot", 250000 , "208"));
        listaVehiculos.add(new Moto("160c", "Yamaha", 80500.50 , "YBR"));
    }
    
    public void mostarVehiculos(){
        this.getListaVehiculos().forEach(System.out::println);
    }
    
    public ArrayList<Vehiculo> getListaVehiculos(){
        return listaVehiculos;
    }
   
   public void ordenarListaVehiculos(){
       Collections.sort(listaVehiculos);
   }
   
   public void mostrarVehiculoMasBarato(){
       final int PRIMERO=0;
       System.out.println("Vehiculo mas barato: " +this.getListaVehiculos().get(PRIMERO).getMarca()+ " "+this.getListaVehiculos().get(PRIMERO).getModelo());
   }
   
   public void mostrarVehiculoMasCaro(){
       final int ULTIMO= this.getListaVehiculos().size()-1;
       System.out.println("Vehiculo mas caro: " +this.getListaVehiculos().get(ULTIMO).getMarca()+ " "+this.getListaVehiculos().get(ULTIMO).getModelo());
   }
   
   public void mostrarVehiculoSegunModelo(String letra){
       System.out.print("Vehiculo que contiene en el modelo la letra '"+letra+"' :");
       for(int i = 0; i<this.getListaVehiculos().size(); i++){
           String modelo= this.getListaVehiculos().get(i).getModelo();
           if(modelo.contains(letra)){
               System.out.println(this.getListaVehiculos().get(i).getMarca() +" "+this.getListaVehiculos().get(i).getModelo()+" $"+ formato.format(this.getListaVehiculos().get(i).getPrecio()));
           }
       }
   }
   
   public void mostrarVehiculosOrdenadosMayorAMenor(){
       for(int i = this.getListaVehiculos().size()-1; i >=0; i--){
           String modelo= this.getListaVehiculos().get(i).getModelo();
           String marca=this.getListaVehiculos().get(i).getMarca();
           System.out.println(marca + " " + modelo);
       }
   }
}