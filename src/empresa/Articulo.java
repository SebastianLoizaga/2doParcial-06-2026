package empresa;

public class Articulo {
    private Componente componentePrincipal;
    private String nombre;

    public Articulo(String nombre, Componente componentePrincipal){
        this.nombre = nombre;
        this.componentePrincipal = componentePrincipal;
    }

    public Componente getComponentePrincipal(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public String toString(){
        
    }
}
