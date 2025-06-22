package articulo;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nombre;
    private List<Composicion> composicion;

    public Componente(String nombre){
        this.nombre = nombre;
        composicion = new ArrayList<Composicion>();
    }

    public void addComposicion(Composicion composiciones){
        composicion.add(composiciones);
    }

    public String getNombre(){
        return this.nombre;
    }

    public List<Composicion> getComposicion(){
        return composicion;
    }

    public boolean esBasico(){
        return composicion.isEmpty();
    }

    /* public String toString(){

    } */
}
