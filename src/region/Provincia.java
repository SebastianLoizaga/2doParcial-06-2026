package region;

import interfaces.CriterioVisualizador;

public class Provincia extends Region{
    private String nombre;
    
    public Provincia(String nombre){
        super(nombre);
    }

    public CriterioVisualizador getCV(){
        return new CriterioTotal();
    }
}