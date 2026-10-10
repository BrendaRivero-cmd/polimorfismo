class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public double calcularMantenimiento() {
        return 80.0;
    }
}
