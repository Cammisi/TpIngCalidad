
package isi.deso.desarrollotrabajopractico;

public class Cliente {
   private String id;
   private long cuit;
   private String mail;
   private String direccion;
   private String nombre;
   private String apellido;
   Coordenada coordenadas;

    public Cliente(String id, long cuit, String mail, String direccion, String nombre, Coordenada coordenadas) {
        this.id = id;
        this.cuit = cuit;
        this.mail = mail;
        this.direccion = direccion;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }
   
    public Cliente(){
        
    }
   
   
    public String getId() {
        return id;
    }

    public long getCuit() {
        return cuit;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public Coordenada getCoordenadas() {
        return coordenadas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadas = coordenadas;
    }
  
   
       
}
   
   
   
