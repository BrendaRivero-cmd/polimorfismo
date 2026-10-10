class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo, int anio){
        super(marca, marca, anio);
    }

    @Override
    public double calcularMantenimiento() {
        return 150.0;
    }

}

