package interfaces;

import articulo.Articulo;
import articulo.Componente;

public interface CriterioVisualizador {
    String componenteToString(Componente componente);
    String articuloToString(Articulo articulo);
}
