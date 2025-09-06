
package isi.deso.desarrollotrabajopractico;

public class Vendedor {
    private String id;
    private String nombre;
    private String direccion;
    Coordenada coordenadas;
    
    public Vendedor(String id, String nombre, String direccion, Coordenada unaCoordenada){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        coordenadas = unaCoordenada;
    }
    public Vendedor(){
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Coordenada getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    public double distancia(Cliente unCliente){
        double dLatitud =  (unCliente.coordenadas.getLatitud()- this.coordenadas.getLatitud())/2;
        double dLongitud = (unCliente.coordenadas.getLongitud()- this.coordenadas.getLongitud())/2;
        double radio= 6372.8;
        
        double distancia;
        double raiz= Math.sqrt(Math.pow((Math.sin(dLatitud)),2)+(Math.cos(coordenadas.getLatitud())*Math.cos(unCliente.coordenadas.getLatitud())*(Math.pow((Math.sin(dLongitud)),2))));
        distancia = 2*radio*Math.asin(raiz);
        
        return distancia;
        
    }
        
        
        
   }
 
