import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Automovil("Toyota", "Corolla", 2021));
        flota.add(new Camion("Volvo", "FH16", 2019));
        flota.add(new Motocicleta("Yamaha", "MT-09", 2025));

        for (Vehiculo vehiculo : flota) {
            System.out.println("Vehiculo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
            System.out.println("Costo de Mantenimiento: " + vehiculo.calcularMantenimiento());
            System.out.println("----------------------------------");
        }

    }
}