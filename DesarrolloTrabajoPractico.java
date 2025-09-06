
package isi.deso.desarrollotrabajopractico;

import java.util.ArrayList;
import java.util.Iterator;

public class DesarrolloTrabajoPractico {

    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(54.0,9.0);
        Coordenada c2 = new Coordenada(32.0,42.0);
        Coordenada c3 = new Coordenada(73.0,13.0);
        Coordenada c4 = new Coordenada(13.4,53.6);
        Coordenada c5 = new Coordenada(90.3,76.2);
        Coordenada c6 = new Coordenada(55.0,01.0);
        Vendedor v1 = new Vendedor("v001","Jose","La Rioja 3240",c1);
        Vendedor v2 = new Vendedor("v002","Valentino","Eva Peron 2341",c2);
        Vendedor v3 = new Vendedor("v003","Mateo","Cruz Roja 235", c3);
        Cliente cliente1 = new Cliente("c001",123456,"c001@gmail.com","Corrientes 2766","Aldana",c4);
        Cliente cliente2 = new Cliente("c002",678923,"c002@gmail.com","San Juan 1234","Lautaro",c5);
        Cliente cliente3 = new Cliente("c003",192837,"c003@gmail.com","San Martin 299","Pedro",c6);
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        System.out.print(v1.distancia(cliente1));
        
       
    
    }
    
    public static Vendedor buscarPorIdVendedor(String id, ArrayList<Vendedor> vendedores){
       Vendedor vendedor= new Vendedor();
        
        for(int i=0; i<vendedores.size(); i++){
            if(id.equals(vendedores.get(i).getId())){
                vendedor = vendedores.get(i);
            }
         }
        return vendedor;
    }
    public static ArrayList<Vendedor> buscarPorNombreVendedor(String nombre,ArrayList<Vendedor> vendedores){
        ArrayList<Vendedor> vendedores1= new ArrayList<>();
        
        for(int i=0; i<vendedores.size(); i++){
            if(nombre.equals(vendedores.get(i).getNombre())){
                vendedores1.add(vendedores.get(i));
            }
         }
        return vendedores1;
    }
    public static void eliminarVendedor(String id, ArrayList<Vendedor> vendedores){
        Iterator iterador = vendedores.iterator();
        while(iterador.hasNext()){
           Vendedor v = (Vendedor)iterador.next();
           if(v.getId().equals(id)){
               iterador.remove();
           }
        }
    }
    public static Cliente buscarPorIdCliente(String id, ArrayList<Cliente> clientes){
       Cliente cliente= new Cliente();
        
        for(int i=0; i<clientes.size(); i++){
            if(id.equals(clientes.get(i).getId())){
                cliente = clientes.get(i);
            }
         }
        return cliente;
    }
    public static ArrayList<Cliente> buscarPorNombreCliente(String nombre,ArrayList<Cliente> clientes){
        ArrayList<Cliente> clientes1= new ArrayList<>();
        
        for(int i=0; i<clientes.size(); i++){
            if(nombre.equals(clientes.get(i).getNombre())){
                clientes1.add(clientes.get(i));
            }
         }
        return clientes1;
    }
    public static void eliminarCliente(String id, ArrayList<Cliente> clientes){
        Iterator iterador = clientes.iterator();
        while(iterador.hasNext()){
           Cliente c = (Cliente)iterador.next();
           if(c.getId().equals(id)){
               iterador.remove();
           }
        }
    }
            
}
