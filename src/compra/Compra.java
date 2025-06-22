package compra;

import java.util.ArrayList;
import java.util.List;

import articulo.Articulo;
import interfaces.CriterioVisualizador;
import interfaces.Pantalla;
import javax.swing.border.SoftBevelBorder;

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

    public void imprimirCompra(Pantalla pantalla, CriterioVisualizador cv){
        StringBuilder sb = new StringBuilder();
        for (Articulo articulo : articulosComprados){
            sb.append(cv.articuloToString(articulo)).append("\n");
        }
        pantalla.mostrar(sb.toString());
    }
}
