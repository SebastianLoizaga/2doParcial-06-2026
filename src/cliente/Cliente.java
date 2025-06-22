package cliente;

import compra.Compra;
import java.util.ArrayList;
import java.util.List;
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
        compras = new ArrayList<Compra>();
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public String getNombre(){
        return this.nombre;
    }

    public Region getRegion(){
        return this.region;
    }

    /* public void imprimirCatalogo(){

    } */

    /* public List<Compra> getCompra(){

    } */
}