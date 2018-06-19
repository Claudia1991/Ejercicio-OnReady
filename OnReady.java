public class OnReady {
    public static void main(String[] args) {
        Consecionaria consecionaria = new Consecionaria();
        consecionaria.cargarVehiculos();
        consecionaria.mostarVehiculos();
        System.out.println("=================================================");
        consecionaria.ordenarListaVehiculos();
        consecionaria.mostrarVehiculoMasCaro();
        consecionaria.mostrarVehiculoMasBarato();
        consecionaria.mostrarVehiculoSegunModelo("Y");
        System.out.println("=================================================");
        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        consecionaria.mostrarVehiculosOrdenadosMayorAMenor();
    }   
}