package interfaces;

import articulo.Componente;

public class CriterioTotal implements CriterioVisualizador{
    public String componenteToString(Componente componente){
        if (componente.esBasico()) return "Componente basico: " + componente.getNombre();
        
    }
}
