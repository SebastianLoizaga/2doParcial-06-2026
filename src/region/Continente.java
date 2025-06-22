package region;

import interfaces.CriterioVisualizador;

public class Continente extends Region{
    private String nombre;

    public Continente(String nombre){
        super(nombre);
    }

    public CriterioVisualizador getCV(){
        return new CriterioElemental();
    }
}
