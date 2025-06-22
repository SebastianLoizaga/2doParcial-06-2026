package region;

import interfaces.CriterioVisualizador;

public abstract class Region implements CriterioVisualizador{
    protected  String nombre;

    public Region(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract CriterioVisualizador getCV();
}
