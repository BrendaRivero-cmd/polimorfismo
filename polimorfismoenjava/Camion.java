class Camion extends Vehiculo{
    public Camion(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public double calcular() {
        return 500.0
    }    
}