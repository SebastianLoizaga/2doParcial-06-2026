package region;

public class Region {
    private String nombre; //provincia(String), pais(String), continente(String) (los 3 tiene un getCV():CriterioVisualizador)

    public Region(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
