package cliente;

import java.util.ArrayList;
import java.util.List;
import compra.Compra;
import region.Region;

public class Cliente {
    private String nombre;
    private List<Compra> compras;
    private Region region;
    private String direccion;

    public Cliente(String nombre, Region region, String direccion){
        this.nombre = nombre;
        this.region = region;
        this.direccion = direccion;
        List<Compra> aux = new ArrayList<Compra>();
        this.compras = aux;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Region getRegion(){
        return this.region;
    }

    public List<Compra> getCompras(){

    }

    public void imprimirCatalogo(){
        
    }
}
