package region;

import interfaces.CriterioVisualizador;

public class Continente extends Region implements CriterioVisualizador{
    private String nombre;

    public Continente(String nombre){
        super(nombre);
    }

    /* public CriterioVisualizador getCV(){
        
    } */
}
