package region;

import interfaces.CriterioVisualizador;

public class Pais extends Region implements CriterioVisualizador{
    private String nombre;

    public Pais(String nombre){
        super(nombre);
    }

    /* public CriterioVisualizador getCV(){
        
    } */
}
