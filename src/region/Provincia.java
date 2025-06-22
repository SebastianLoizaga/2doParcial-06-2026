package region;

import interfaces.CriterioVisualizador;

public class Provincia extends Region implements CriterioVisualizador{
    private String nombre;
    
    public Provincia(String nombre){
        super(nombre);
    }

    /* public CriterioVisualizador getCV(){
        
    } */
}