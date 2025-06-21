package articulo;

public class Articulo {
    private Componente componente;
    private String nombre;

    public Articulo(String nombre, Componente componente){
        this.nombre = nombre;
        this.componente = componente;
    }

    public Componente getComponente(){
        return this.componente;
    }

    public String getNombre(){
        return this.nombre;
    }

    /* public Stirng toStirng(){

    } */
}