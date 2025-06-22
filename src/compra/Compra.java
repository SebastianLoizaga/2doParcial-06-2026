package compra;

import java.util.ArrayList;
import java.util.List;

import articulo.Articulo;

public class Compra {
    private List<Articulo> articulosComprados;

    public Compra(){
        articulosComprados = new ArrayList<Articulo>();
    }

    public void addArticulo(Articulo articulo){
        articulosComprados.add(articulo);
    }

    public List<Articulo> getArticulo(){
        return articulosComprados;
    }

    /* public void imprimirCompra(){

    } */
}
