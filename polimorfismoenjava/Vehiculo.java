import java.util.Arraylist;

class Vehiculo{
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio(){
        return Anio;
    }
    public void setAnio(Int Anio) {
        this.Anio = Anio;
    }

    public double calcularMantenimiento() {
        return 50.0;
    }
}

