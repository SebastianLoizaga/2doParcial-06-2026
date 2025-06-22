package cliente;

import compra.Compra;
import interfaces.Pantalla;
import java.util.ArrayList;
import java.util.List;

import articulo.Articulo;
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

    public void imprimirCatalogo(Pantalla pantalla){
        StringBuilder sb = new StringBuilder();
        for (Compra compra : compras){
            for (Articulo articulo : compra.getArticulo()){
                sb.append(region.getCV().articuloToString(articulo)).append("\n");
            }
        }
        pantalla.mostrar(sb.toString());
    }

    public List<Compra> getCompra(){
        return compras;
    }
}