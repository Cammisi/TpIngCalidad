
package isi.deso.desarrollotrabajopractico;

public class Coordenada {
    private double latitud;
    private double longitud;

    private double altitud;       // Nuevo atributo
    private String descripcion;   // Nuevo atributo

    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Coordenada(double latitud, double longitud, double altitud, String descripcion) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.descripcion = descripcion;
    }

    public Coordenada() {
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
    

